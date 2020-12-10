# How many profiles can you have ?
Spring Framework does not specify any explicit limit on number of profiles, however since some of the classes in Framework,
like ```ActiveProfilesUtils``` used by default implementation of ```ActiveProfilesResolver``` are using array to 
iterate over profiles, this enforces inexplicit limit that is equal to maximum number of elements in array that you can 
have in Java, which is Integer.MAX_VALUE  (2³¹ - 1) 