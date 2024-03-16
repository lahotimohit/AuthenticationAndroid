package com.example.authentication

class UserModel(private var username:String, private var password:String)
{
    fun setUsername(username: String) {
        this.username=username
    }
    fun setPassword(password: String) {
        this.password=password
    }
    fun getUsername() :String {
        return username;
    }
    fun getPassword(): String {
        return password
    }
}