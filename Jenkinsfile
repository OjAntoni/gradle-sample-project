pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        gradle "gradle"
    }

    stages {
        stage('Build') {
            steps {
                sh "gradlew clean bootJar"
            }
        }
        stage('TEST'){
            steps {
                sh "gradlew test"
            }
        }
        stage('deploy'){
            steps {
                sh "gradlew clean deployHeroku"
            }
        }
    }
}
