# Bug (?) in Spring Boot 3.1.5

**Two identical calls to the same Repository, depending on the order of the calls it works or does not work.**


**To reproduce**:

- Clone this repo

- Execute the methods separated with:

```
./mvnw clean test -Dtest="SpringJpaConcatApplicationTests#this_WORKS_InSpringBoot_3_1_5"
```

or:

```
./mvnw clean test -Dtest="SpringJpaConcatApplicationTests#this_DOES_NOT_WorkInSpringBoot_3_1_5"
```

- For the first call, the "test" should be green (actually it does not assert something, but the database query should not fail at all)
- For the second call, the test fails with a postgres error message

Note that both test methods are identical, only that the order of the two calls to the Repository differ.
This works before Spring Boot 3.1.5 (set SB version in `pom.xml` to 3.1.4 and re-execute, everything is fine)

