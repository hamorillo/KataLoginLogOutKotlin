# Kata Login/LogOut Kotlin [![Build Status](https://travis-ci.org/hmorillo/KataLoginLogOutKotlin.svg?branch=master)](https://travis-ci.org/hmorillo/KataLoginLogOutKotlin)

Kata from: https://github.com/Karumi/KataLogInLogOutKotlin/

## Previous task

- [X] Create a git repository with an empty Android app inside.
- [X] Configure Travis CI or any other CI tool.
- [X] Read the requirements twice.

## Movement 1: Writing the app.

- [ ] Build an app with only one screen that allows you to log in if the username and the password are equal to admin.
- [ ] After the log in, the user should be able to log out if the log out button is pressed and the second when the button was pressed was even.
- [ ] Add validation for the username field so chars as ,, ., and ; are not allowed. Show a toast explaining the error if the username contain these chars.
- [ ] The code to log the user in and out has to been executed out of the main thread.

## Movement 2: Testing the app using just unit tests.

- [ ] Take some time to think about what should you test and how. Did you find any issue with this code that does not let you test it?
- [ ] Using some common testing patterns re-implement part of your app making it testable and start adding coverage. Think twice your changes before start coding and test all the code you move using just unit tests.

## Movement 3: Persist information.

- [ ] Make the app persist the user session and show the UI buttons based on the user persisted session.
