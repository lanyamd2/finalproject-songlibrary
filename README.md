# finalproject-songlibrary
Here is the final project. It features a song library where you can enter and delete songs, as well as filter songs by title, artist and song length.

The MySQL database called 'restapi' is connected to the Spring Boot Application via the Wamp Server and 'application.properties' configuration file.
The user is required to load the WampServer, then run the 'ProjectSonglibraryApplication' class.

The user may then access the song library via Postman by following the instructions below.

The following instructions outline how to use this Spring application:

*** Instructions ***
The server port is set to 8282

Therefore, to access the application you will need to use the format:

localhost:8282/{insert desired path}

The user can access the Welcome Page by inserting the following url into their web browser: http://localhost:8282/
On the welcome page the user may use the hyperlink labelled "View Instructions" to get information on how to use the song library.

The following are details on the features of the application:

*** View all songs ***
To view the full list of songs use the url: http://localhost:8282/songs
NOTE: This can be done either by specifying the GET method in Postman and entering the url, or by loading the url in a private web browser.


*** Find Songs ***

Find Songs By ID:
Use the following url format to find songs by their their id: http://localhost:8282/song/{id}

Replace {id} with the ID number linked to the song you'd like to find

Find Songs By Title:
Use the following url format to find songs by their title: http://localhost:8282/songtitle/{title}

Replace {title} with the title of the song you would like to find

Find Songs By Artist:
Use the following url format to find songs by their artist: http://localhost:8282/songartist/{artist}

Replace {artist} with the artist of the song you would like to find

Find Songs By Song Length:
Less Than -
Use the following url format to find songs whose lengths are below a certain number: http://localhost:8282/songlengthless/{length}

Replace {length} with the maximum number of minutes you'd like to filter out

Greater Than -
Use the following url format to find songs whose lengths are above a certain number: http://localhost:8282/songlengthgreater/{length}

Replace {length} with the minimum number of minutes you'd like to filter out

NOTE: This can be done either by specifying the GET method in Postman and entering the url, or by loading the url in a private web browser.


*** Add Songs ***
You can add songs via Postman by completing the following instructions:

Select the POST method and enter the following url: http://localhost:8282/newsong
Select the Body tab, then raw JSON
Enter the following JSON format: { "id": 1, "title": "Song_Name", "artist": "Song_Artist", "length": 2.0 }
Please note that the ID is an integer and the song length is a float

*** Delete Songs ***
You can delete songs via Postman by completing the following instructions

Select the DELETE method and enter the following url: http://localhost:8282/deletesong/{id}
Replace {id} with the ID No linked to the song you'd like to delete

