# What is the naming convention for finder methods in a Repository interface?
find[*limit*]By[*property/properties expression*][*comparison*][*ordering operator*]

*limit* - result of the query can be limited by usage of first/top keyword
- findFirst10ByLastName
- findFirstByOrderByLastNameAsc
- findTop3ByLastname
- findTopByOrderByAgeDesc

*property/properties expression* - result will be filtered based on property of entity, multiple properties can be used 
with usage of And, Or keyword
- findByLastnameAndFirstname
- findByLastnameOrFirstname
- findByFirstname

*comparison* - comparison mode can be specified after specifying property used for filtering 
- findByFirstnameIs
- findByFirstnameEquals
- findByStartDateBetween
- findByAgeLessThan, findByAgeLessThanEqual
- findByAgeGreaterThan, findByAgeGreaterThanEqual
- findByStartDateBefore, findByStartDateAfter
- findByAgeIsNull, findByAgeNotNull
- findByFirstnameLike, findByFirstNameNotLike
- findByFirstnameStartingWith, findByFirstnameEndingWith
- findByFirstnameContaining
- findByLastnameNot
- findByAgeIn(Colection<Age> ages), findByAgeNotIn(Colection<Age> ages)
- findByActiveTrue, FindByActiveFalse
- findByFirstnameIgnoreCase

*ordering operator* - optionally you can specify ordering operator at the end of method name
- findByLastnameOrderByFirstnameAsc
- findByLastnameOrderByFirstnameDesc