package com.cadesa.springboot.backend.apirest.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.123456789";
	
	      public static final String RSA_PRIVADA = 
			  "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDAFmRBwZdDq4e1\r\n"
			+ "hyZxxjmL8O2mBNXfkPOKC8uQptBetIb4/rZxRbHqmZflZ21CGTpcuN+vqWC3Bi1R\r\n"
			+ "c5Kirw3ZAzyqLHJvFLpdzINipkQHlQY7OidD/PMrVcHgUSFoXjKCnXXPpFQXLYHx\r\n"
			+ "tpMRZ2dx8GODTWYeuRVowZmNPG03agcX7hYF23V6Hpi/MxKqxfvVNWHJf6XGZ0ob\r\n"
			+ "vwUS0jS/Srv9vJ9+girVuMM234QB1S+B68NF5gndWJjexx+rkRc7oUZZtdWCcbSo\r\n"
			+ "xBM6ASVy+zh6vwshmTLfeIWN1BYvsd6dmzSV6gspk/IsC5ZDe0QcTbkPL7v2BqXp\r\n"
			+ "cEZnCmr9AgMBAAECggEAIt3tpOH3Cxl/sLuvhsdserJo8NG/4Kz3B//MG52sBQTP\r\n"
			+ "2zKg+z6jZOosYD+93Vmm9l24fLJKE+7TGw3XeCA+az3jLSCURQWGLrCIyMdVYerz\r\n"
			+ "Dp0ns3eezCbs4kLXxZITqRHb6KzzdqGUDMQPPgF/DXeNGLBb8Qe3kyRRMwnc6UnM\r\n"
			+ "9MCCwBxbRqIDNipgGMAZQUdgmkgADjWvlwXHs3YImyBWIGv/YNzUGP+F6ajFzOm8\r\n"
			+ "AKafhKwdEBCUKX0j7FM08hm2jX90UoA6mKGyUWXq8Zc23iaeVhDx9US9/fdLkuzo\r\n"
			+ "qwqqz00RrS5nMVJFxLO1WKW0A8kXreU27IdsqgzUIQKBgQDvArQYwBnb2biIH6gI\r\n"
			+ "rpGX6Rz9u3D2mar7pvCgcgTEupJzwObS92i2oM50ymk1SFAEiew/wzUzGcPzKb/D\r\n"
			+ "2nY/pm1Ypnz2dosvz7I3TjC3nIfQUtn6S5KJ4pWUDxcjTtynrGO8q6o/krIPEMjs\r\n"
			+ "01FnvhLurkilCecfjqhP5q0uLwKBgQDNvdMMlMvbU6ycPXbvD6eFdqtftxqvYqt7\r\n"
			+ "deVRUdSUqcy9+lYPvLjwNS6BL1/EL82ggHak1qBGO6BDXCq09qd366fG+zo1malK\r\n"
			+ "++z0IQGSsLOcuI/sPNH6oSdkcFXK47/KI5ZfxTzY+CZ7/UXz1TBb2A1pl+IxzQd9\r\n"
			+ "tYtWXLH6kwKBgQDOwcLz6jI0ajpknyXoJMNT61el8yE8YiB0Q6zCzv9rA46vTb8f\r\n"
			+ "3uCZo7AVfgfXDPATjRBu9DowM2i8EHCQR4qlcx4CYzuUpWWwfXZIu34PR/yA7Tsd\r\n"
			+ "d4STfQwyIX+9jnn5HnrE+qdzCT65I6b8n607FkUgbmnvQwrJ1MmrHPzRBwKBgF+R\r\n"
			+ "/PaMLAIO5VCScKvt/qhNjp/go4Gy+OtZwZM7yt7f3V6madHXnaTfX2HdCsRMXF1h\r\n"
			+ "Lzu1AzB8xB5mMuRq6zIWgpI44zpAzdYqHlDtABkPAfAb/6cCPZwJvg227PNZRh70\r\n"
			+ "1wZXzcMPyniwFw2EC3mua9SQHB98GS245ifQ2VAHAoGBAOYrbZk3vacOhmiIWZMH\r\n"
			+ "3Nq04a43ySPmaqaKO3b//xdDXEfsB1YJ680cnu6uLJ4gkIKN23qOpLzM5dooUwsE\r\n"
			+ "b9MffnP4iII7oBK3PhVwSNwq0OBxjlbOKMCXyztT0uam+EPPltmkO/TnvR2j7WWt\r\n"
			+ "yuu6SzhAJBcnijfyEdVHQo8l\r\n"
			+ "-----END PRIVATE KEY-----";
	
	       public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwBZkQcGXQ6uHtYcmccY5\r\n"
			+ "i/DtpgTV35DzigvLkKbQXrSG+P62cUWx6pmX5WdtQhk6XLjfr6lgtwYtUXOSoq8N\r\n"
			+ "2QM8qixybxS6XcyDYqZEB5UGOzonQ/zzK1XB4FEhaF4ygp11z6RUFy2B8baTEWdn\r\n"
			+ "cfBjg01mHrkVaMGZjTxtN2oHF+4WBdt1eh6YvzMSqsX71TVhyX+lxmdKG78FEtI0\r\n"
			+ "v0q7/byffoIq1bjDNt+EAdUvgevDReYJ3ViY3scfq5EXO6FGWbXVgnG0qMQTOgEl\r\n"
			+ "cvs4er8LIZky33iFjdQWL7HenZs0leoLKZPyLAuWQ3tEHE25Dy+79gal6XBGZwpq\r\n"
			+ "/QIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";

}
