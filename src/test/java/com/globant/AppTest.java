package com.globant;


import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @BeforeMethod(groups = {"test 1","test 2"})
    public void logIn(){
        System.out.println("Log In");
    }
    @BeforeMethod(groups = {"test 1","test 2"}, dependsOnMethods = "logIn")
    public void lookProfile(){
        System.out.println("Profile");
    }
    @BeforeMethod(groups = {"test 1"},dependsOnMethods = "lookProfile")
    public void lookFriends(){
        System.out.println("my Friends");
    }
    @BeforeMethod(groups = {"test 1"},dependsOnMethods = "lookFriends")
    public void selectFriend(){
        System.out.println("Friend selected");
    }
    @AfterMethod(groups = {"test 1","test 2"})
    public void logOut(){
        System.out.println("Log Out");
    }
    @BeforeMethod(groups = {"test 2"},dependsOnMethods = "lookProfile")
    public void editProfile(){
        System.out.println("Editing Profile");
    }

    @Test(groups = {"test 2"})
    public void changeProfilePicture(){
        System.out.println("Changing Profile Picture");
    }

    @Test(groups = {"test 1"})
    public void deleteFriend(){
        System.out.println("Friend deleted");
    }
}

