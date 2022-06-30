pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        gradle "gradle"
    }

    stages {
        stage('Build') {
            steps {
                sh "gradle clean bootJar"
            }
        }
        stage('TEST'){
            steps {
                sh "gradle test"
            }
        }
        stage('deploy'){
            steps {
                sh "gradle deployHeroku"
            }
        }
    }
}
