pipeline {
    agent any 
    
    tools {
        maven 'maven3.9.4' 
    }
   
    stages {
        stage('Clone Git Repository') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/OpalJain/Agile_Project.git'
            }
        }
        stage('Build Project') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Execute Unit Tests') {
      		steps {
        		bat 'mvn test'
      		}
    	}
        stage('Static Code Analysis (SonarQube)') {
        	steps {
        		withSonarQubeEnv('SonarQube_server'){
        		 bat 'mvn clean package sonar:sonar'   
        		}
      		}
        }
        stage('Archive Artifacts') {
            steps {
                archiveArtifacts 'target/*.jar'
            }
        }
        stage('Deploy Application (Simulation)') {
            steps {
                echo 'Successfully deployed the application!'
            }
        }
    }
}
