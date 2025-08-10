pipeline {
    agent any 
    stages {
      stage('compile'){
        steps{
          bat 'javac Factorial.java TestFact.java'
        }
      }
        stage('Test'){
          steps{
          bat 'java TestFact.java'
        }
      }
      stage('Run'){
        steps{
          bat 'java Factorial.java'
        }
      }

      stage('Package JAR'){
        steps{
          bat 'jar cfm factorial.jar manifest.txt  Factorial.class'
        }
      }
      stage('Archive JAR'){
        steps{
          archiveArtifacts artifacts:'factorial.jar'
        }
      }
  }
   post{
     success{
       echo 'Build,test,run and jar creation successful and artifact is ready!'
     }
     failure{
       echo 'Build or test failure'
     }

}
}
