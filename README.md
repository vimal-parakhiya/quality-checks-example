# quality-checks-example
Example Plugin Configuration demonstrating PMD, Check Style and Find Bugs Plugins

Run `mvn clean install site:site site:stage` to generate maven site containing PMD, CheckStyle and FindBugs reports. The reports (maven site) would be located at `target/staging`.
 
Run `mvn sonar:sonar -Dsonar.analysis.mode=preview -Dsonar.issuesReport.html.enable=true` for generating sonar report locally. This would require sonarqube server to be up and running locally at [http://localhost:9000](http://localhost:9000/)