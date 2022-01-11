package day12_Scanner;

public class HTTP {
    public static void main(String[] args) {
        int statusCode= 400;
        String a;

        switch (statusCode){
            case 200:
                a="ok";
                break;
            case 201:
                a="Created";
                break;
            case 202:
                a="Accepted";
                break;
            case 301:
                a="Moved Permanently";
                break;
            case 303:
                a="See Other";
                break;
            case 304:
                a="Not Modified";
                break;
            case 307:
                a="Temporary Redirect";
                break;
            case 400:
                a="Bad Request";
                break;
            case 401:
                a="Unauthorized";
                break;
            case 403:
                a="Forbidden";
                break;
            case 404:
                a="Not Found";
                break;
            case 410:
                a="Gone";
                break;
            case 500:
                a="Internal Server Error";
                break;
            default:
                a="Service Unavailable";

        }
        System.out.println(a);



    }
}


/*
HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status code:
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


         declare an int variable called StatusCode, write a switch that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok
 */