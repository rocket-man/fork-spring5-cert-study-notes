# Does Spring Security support password hashing? What is salting?
Yes, Spring Security supports password hashing through ```PasswordEncoder``` interface and has built-in support
for following encoders:
- bcrypt
- pbkdf2
- scrypt
- argon2
- sha256
- ...

```PasswordEncoder``` interface contains following methods:
- ```encode``` - encode the raw password
- ```matches``` - verifies if raw password provided as input matches encoded password, password is never 
decoded, one-way algorithms are used
  
- Password hashing upon registration 

Upon registration password is encoded (hashed) and never stored in cleartext.

Spring security also provides ```DelegatingPasswordEncoder```, which uses one of the selected ```PasswordEncoder``` to encode  
password, and list of provided passwords decoders to verify password upon login.

```DelegatingPasswordEncoder``` is useful as it provides flexibility and ability to easily switch between ```PasswordEncoders```
while keeping backward compatibility, for already stored hash values of passwords.

```DelegatingPasswordEncoder``` stores hash values for password as calculated by selected ```PasswordEncoder``` with identifier
stored as prefix, for example: 
```{bcrypt}$2a$10dXHW28SHSDKHsdasdjk.20asdalskdj.kjsafkjwqh.kjsakjdsa/BG```

If storage contains other algorithms used as well, for example:
```{bcrypt}$2a$10dXHW28SHSDKHsdasdjk.20asdalskdj.kjsafkjwqh.kjsakjdsa/BG```
```{pbkdf2}5d34vb45lknsdlknds32lknjdslknlksalkvlkjwekiqksd2qehsadndsadsadsaljjwq```
```{sha256}97kjfdsfewfdslkjfdslkjlknfewr32r32jhiofewlknfer32qoihfewoinhvdvdpojcs```

Prefix is used to delegate password verification to correct ```PasswordEncoder```

---

Password salting is a security mechanism invented to protect against reversing cryptographic hash functions, with usage of a 
precomputed tables like rainbow Tables.

Password salting assumes that whenever hash for a password is computed, a sequence fo random bytes, known as salt is added 
to cleartext password before calculating hash value. This way, database will not contain same hash values for the same passwords

When password is verified, salt that is stored in clear text alongside hash value for a password is used again to verify if provided
password matches hash value.


