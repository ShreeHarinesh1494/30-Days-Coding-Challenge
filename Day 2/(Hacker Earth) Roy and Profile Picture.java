Problem
Roy wants to change his profile picture on Facebook. Now Facebook has some restriction over the dimension of picture that we can upload.
Minimum dimension of the picture can be L x L, where L is the length of the side of square.

Now Roy has N photos of various dimensions.
Dimension of a photo is denoted as W x H
where W - width of the photo and H - Height of the photo

When any photo is uploaded following events may occur:

[1] If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
[2] If width and height, both are large enough and
(a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
(b) else user is prompted to crop it. Print "CROP IT" in this case.

 Solution :

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int t=sc.nextInt();
        if(t>=1 && t<=1000)
        {
            for(int i=0;i<t;i++)
            {
                int w=sc.nextInt();
                int h=sc.nextInt();
                if(w<l || h<l)
                {
                    System.out.println("UPLOAD ANOTHER");
                }
                else if(w==h)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
        }

    }
}
