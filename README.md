## Introduction

We are creating a platform for interviewers and recruiters
where they can organize and arrange interviews for
potential candidates after looking at the available
slots of both interviewers and interviewees.
In this way, a potential platform will enable timely
updates related to the recruitment process.

RestFull API
1. POST
To add data of the user(register user)-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/users
  {
  "name": "himanshu arora",
  "email": "himanshu.arora@accolitedigital.com",
  "userRole": {
    "userId": 4,
    "role": "interviewer"
  },
  "gender": "Male",
  "location": "Bangalore",
  "contactNo": "6290034255",
  "exp": 2
}

2.GET
To fetch all the records from the user Table -> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/users

3.GET
To fetch user data(interviewer)-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/users/role?role=interviewer

4.GET
To fetch data of the users via email(login)-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/users/harsh.arora@accolitedigital.com

5.GET
To fetch user data via users id-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/user/1

6.GET
To get all the roles of the users-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/userRole

7.GET
To fetch list of all free slots by interviewer id-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/User/Interview/all?i_id=6

8.GET
To get the slot data by slot id-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/User/Interview/free?fs_fk=8

9.POST
To book free slots(interviewer)-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/User/Interview/create
{
    "i_id":12,
    "slot": [
        {
            "date":"2022-06-12",
            "time":"18:00:00"
        }
    ]
}

10.GET
To show the slot booked by a particular interviewer in calender(Interviewer))-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/User/Interview/booked?i_id=2

11.GET
To get which candidate has been assigned to a interviewer-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/slotsBook/booked?i_id=2

12.POST
To book the slots using slot id , intervier id (Recruiter)->http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/slotsBook/?slot_id=6&i_id=6&cname=sumit&r_id=2

13.PUT
To update a booked Slot by slot Id-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/slotsBook/2
{
    "slot_b_id": 1,
    "r_id": 0,
    "i_id": 2,
    "date": "2021-06-21",
    "time": "12:00:00",
    "candidate_name": "Suman"
}

14.GET
To fetch all the slots that has been booked by different recrutier->http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/slotsBook

15.POST
To add skill for a interviewer-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/skills
{
    "userRole":{
        "userId":3,
        "role":"interviewer"
    },
    "skill":"java",
    "round":3
}

15.GET
To fetch interviewer for a particular skills(recrutier)-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/skills/?skill=java

16.GET
To fetch skill for a particular interviewer-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/skills?id=3

17.DEL
Delete a skill for a particular user-> http://ec2-3-111-33-68.ap-south-1.compute.amazonaws.com:8080/skills/?id=3&skill=java
