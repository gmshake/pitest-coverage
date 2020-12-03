# A maven project to demonstrate coverage bugs of pitest-maven plugin

A maven project to demonstrate coverage bugs of pitest-maven plugin


## Prerequisite

* Java 1.8 is required
* Maven 3.3.9 or later is required


## Build and produce the pit reports

```shell
mvn clean verify
```

The console build log:
```console
...
[ERROR] Failed to execute goal org.pitest:pitest-maven:1.5.2:mutationCoverage (mutation-test) on project pitest-coverage: Line coverage of 83(5/6) is below threshold of 100 -> [Help 1]
```

## Verify the reports

Open the pit reports in maven project target dir, `target/pit-reports/${GENERATED_DATETIME}/index.html`, the report shows the line coverate value is 4/5 ,
but in the console above it is 5/6 .
