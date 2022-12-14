package com.pmp.pensionerauth.jwt;

import java.io.Serializable;
import java.util.Date;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.pmp.pensionerauth.exception.JwtTokenMalformedException;
import com.pmp.pensionerauth.exception.JwtTokenMissingException;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import lombok.extern.slf4j.Slf4j;
/*
@Slf4j
@Component
public class JwtUtil {

	@Value("${jwt.secret}")
	private String jwtSecret;

	@Value("${jwt.token.validity}")
	private long tokenValidity;
	
	public String generateToken(Long long1) {
		Claims claims = Jwts.claims().setSubject(String.valueOf(long1));
		long nowMillis = System.currentTimeMillis();
		long expMillis = nowMillis + tokenValidity;
		Date exp = new Date(expMillis);
		return Jwts.builder().setClaims(claims).setIssuedAt(new Date(nowMillis)).setExpiration(exp)
				.signWith(SignatureAlgorithm.HS512, jwtSecret).compact(); 
	}
	
	

	public Claims getClaims(final String token) {
		try {
			Claims body = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
			return body;
		} catch (Exception e) {
			System.out.println(e.getMessage() + " => " + e);
		}
		return null;
	}

	
	public String getUserIdFromToken(String token) {
		return getClaimFromToken(token, Claims::getSubject);
	}
	
	public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
		final Claims claims = getClaims(token);
		return claimsResolver.apply(claims);
	}

	public String validateToken(String token) throws JwtTokenMalformedException, JwtTokenMissingException {
		try {
			if(token == null) {
				throw new JwtTokenMalformedException("notfound");
			}
			
			boolean check = Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token) != null;
			String user = getUserIdFromToken(token);
			log.info("validated");
			return user;
		} catch (SignatureException ex) {
			throw new JwtTokenMalformedException("Invalid JWT signature");
		} catch (MalformedJwtException ex) {
			throw new JwtTokenMalformedException("Invalid JWT token");
		} catch (ExpiredJwtException ex) {
			throw new JwtTokenMalformedException("Expired JWT token");
		} catch (UnsupportedJwtException ex) {
			throw new JwtTokenMalformedException("Unsupported JWT token");
		} catch (IllegalArgumentException ex) {
			throw new JwtTokenMissingException("JWT claims string is empty.");
		}
		
	}

}*/
@Slf4j
@Component
public class JwtUtil implements Serializable {

	private static final long serialVersionUID = -2550185165626007488L;

	public static final long JWT_TOKEN_VALIDITY = 5 * 60 * 60;

	@Value("${jwt.secret}")
	private String jwtSecret;
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public String generateToken(Long long1) {
		Claims claims = Jwts.claims().setSubject(String.valueOf(long1));
		long nowMillis = System.currentTimeMillis();
		long expMillis = nowMillis +JWT_TOKEN_VALIDITY *1000;
		Date exp = new Date(expMillis);
		return Jwts.builder().setClaims(claims).setIssuedAt(new Date(nowMillis)).setExpiration(exp)
				.signWith(SignatureAlgorithm.HS512, jwtSecret).compact(); 
	}
	
		public String getUsernameFromToken(String token) {
			return getClaimFromToken(token, Claims::getSubject);
		}

		public Date getExpirationDateFromToken(String token) {
			return getClaimFromToken(token, Claims::getExpiration);
		}

		public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
			final Claims claims = getAllClaimsFromToken(token);
			return claimsResolver.apply(claims);
		}

		public Claims getAllClaimsFromToken(String token) {
			return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
		}


		private Boolean isTokenExpired(String token) {
			final Date expiration = getExpirationDateFromToken(token);
			return expiration.before(new Date());
		}

		public Boolean validateToken(String token) throws JwtTokenMalformedException, JwtTokenMissingException {
			try {
				if(token == null) {
					throw new JwtTokenMalformedException("notfound");
				}
				Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token) ;
				final String username = getUsernameFromToken(token);
				log.info("validated");
				return (username != null && !isTokenExpired(token));

			} catch (SignatureException ex) {
				throw new JwtTokenMalformedException("Invalid JWT signature");
			} catch (MalformedJwtException ex) {
				throw new JwtTokenMalformedException("Invalid JWT token");
			} catch (ExpiredJwtException ex) {
				throw new JwtTokenMalformedException("Expired JWT token");
			} catch (UnsupportedJwtException ex) {
				throw new JwtTokenMalformedException("Unsupported JWT token");
			} catch (IllegalArgumentException ex) {
				throw new JwtTokenMissingException("JWT claims string is empty.");
			}
		}
}