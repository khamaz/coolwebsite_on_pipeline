pipeline{
    agent any
    triggers {
        cron('* * * * *')
    }
    stages{
       stage("Git Clone"){
           steps{
              git "git@github.com:khamaz/coolwebsite_on_pipeline.git"
           }
       }
       stage("Copy file to Web"){
           steps{
               sh "cp -f index.html /var/www/html/index.html"
           }
       }
       stage("Test"){
           steps{
               sh "echo Test"
           }
       }
    }
}