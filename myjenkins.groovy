pipeline{
  agent any
  {
    stages{
      stage ('Build'){
        echo 'Building the application'
      }
      stage ('Test'){
        echo 'Testing the environment'
      }
      stage ('Deploy'){
        echo 'Deploying the envionment'
      }
    }
  }
}
