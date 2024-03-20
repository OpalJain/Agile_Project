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
        stage('Static Code Analysis (Dummy)') {
            steps {
                echo 'Simulating Static Code Analysis...'
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
