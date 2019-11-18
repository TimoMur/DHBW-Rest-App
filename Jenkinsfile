pipeline {
  agent {
    docker {
      image 'maven'
      args '-v /root/.m2:/root/.m2'
    }

  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
    stage('Build docker image') {
      steps {
        sh 'sudo docker build . -t dhbw-rest-app'
      }
    }
  }
}
