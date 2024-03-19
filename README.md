# Guess The Word - LSO Project 2022/23

**Running the database**

1. Install docker

2. Pull the latest postgres image via Docker Desktop or via command line:

    ```bash
    docker pull postgres
    ```

3. Run the container of our database:

    ```bash
    docker-compose -f database-docker-compose.yml up
    ```

* Finished! Now every time you need to stop or run again the container use:

    ```bash
    docker stop lsodb
    ```

    ```bash
    docker start lsodb
    ```

**Running the server**

1. Copy the "Server.o" file into a linux environment, with the database container running.

2. give it execution permission:

    ```bash
    chmod +x Server.o
    ```

3. run it:

    ```bash
    ./Server.o
    ```

**Running the App**

Copy the "GuessTheWord.apk" file into a smartphone with at least the "Nougat" version of Android (sdk > 24). The target version of the app is "Upside Down Cake" (sdk 34). Then just open it and install it.

* **Note:** Ensure that all clients are connected to the same router which the server is connected to.