pipeline    {
agent any

stages{
    stage ("Compile Stage")
        stage{
       echo 'Compiling Application...'
        }
    }
    stage("Testing Stage"){
        stage{
        echo 'Testing Application...'
        }
    }
    stage("Deployment Stage"){
        stage{
       echo 'Deploying Application...'
        }
    }
}

