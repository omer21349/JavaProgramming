package day10_NestedIf;

public class HTPP {
    public static void main(String[] args) {
        int num= 503;

        String b=(num==200)?"OK":(num==201)?"Created":(num==202)?"Accepted":(num==301)?"Moved Permanently":(num==303)?"See Other":(num==304)?"Not Modified":(num==307)?"Temporary Redirect":(num==400)?"Bad Request":
                (num==401)?"Unauthorized":(num==403)?"Forbidden":(num==404)?"Not Found":(num==410)?"Gone":(num==500)?"Internal Server Error":
                        (num==503)?"Service Unavailable":"invalid";
        System.out.println(b);






    }
}

/*
HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a vlaid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

            NOTE: MUST USE TERNARY.

 */
