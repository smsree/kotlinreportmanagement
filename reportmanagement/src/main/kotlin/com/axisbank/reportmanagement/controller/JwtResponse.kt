package com.axisbank.reportmanagement.controller

class JwtResponse(var jwt: String, var id: Int, var username: String, var email: String, var roles: MutableList<String>) {



}