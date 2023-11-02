```

 ______   ________   ______   _________   ______      
/_____/\ /_______/\ /_____/\ /________/\ /_____/\     
\:::_ \ \\::: _  \ \\:::_ \ \\__.::.__\/ \:::_:\ \    
 \:(_) \ \\::(_)  \ \\:(_) ) )_ \::\ \      /_\:\ \   
  \: ___\/ \:: __  \ \\: __ `\ \ \::\ \     \::_:\ \  
   \ \ \    \:.\ \  \ \\ \ `\ \ \ \::\ \    /___\:\ ' 
    \_\/     \__\/\__\/ \_\/ \_\/  \__\/    \______/  
                                                      
```

### In this part! We would love to hear a little from you... literally =)

## English
Please record a 30-60 second audio IN ENGLISH about your favorite technology learning resources. You can be as creative as you want! How do you learn? How do you like to learn? Where do you find what to learn? Please ensure the following:
- The audio must be in English. We will not process any submissions in Spanish. However! Please know we are not looking for perfect English, simply that you are taking the effort to study English well enough to be able to articulate something like this.
- Please, no more than 60 seconds. We would like to be able to give your audio our full attention!

_Your audio should NOT be saved in this repository. Please keep it separate so you can upload it in the submission form. It can be in any audio format such as wav, mp3, ogg, etc._

Hello, I'm Diego Felipe, and picking a single favorite learning resource is no easy task. I have a penchant for self-paced courses, but I also highly value synchronous sessions where I can get real-time answers to my questions. Typically, my learning journey starts with a YouTube video from a familiar content creator. I extract the key takeaways and then venture into a world of diverse learning resources. Platforms like Udemy, Coursera, and courses from tech giants like Cisco, Oracle, and IBM are on my radar. However, these courses come with their unique challenges, such as tackling specific queries or wrapping my head around complex concepts. To overcome these hurdles, I take a two-pronged approach, simultaneously delving into official documentation, actively participating in forums, and engaging with like-minded communities. AI models like Chat GPT have been invaluable in clarifying my doubts. They offer practical examples and teach self-correction, serving as accessible virtual tutors. Of course, I always double-check the generated information to ensure its accuracy.

While learning from a variety of sources may seem a bit chaotic at first, it all comes together to broaden my perspective and enhance my abstract thinking. That's why I often kickstart my learning journey with a lightweight introduction to gain a comprehensive overview. I take charge of my learning journey, meticulously planning my daily schedule to ensure consistent progress.

As with any skill, practice is the key to retention, especially in the realm of information technology. What I find particularly rewarding is the ability to apply newly acquired knowledge directly to hands-on projects. I enjoy diving into the evolution of technologies, exploring their development from early iterations to cutting-edge advancements. For example, my recent exploration of Spring Boot led me to pause and delve into Java Enterprise Edition, laying a strong foundation that underpins Spring.

One defining aspect of my learning approach is the parallel exploration of multiple subjects. These subjects may not always belong to the same domain, but they are often interconnected. For instance, alongside mastering a specific programming language, I might simultaneously explore project management, virtualization, Docker, cybersecurity, or enhance cross-cutting skills like improving my proficiency in English.




## Cloud Computing
In this section, we would like to learn a little about your experience with cloud computing platforms such as AWS, GCP, or Azure.

Hopefully, you are familiar with the pervasive social media app, Instagram! Instagram uses cloud computing services to ensure that you have a performant experience as an end user, and that it can serve billions of users around the world at scale. Instagram has a Stories feature in the top horizontal bar which displays video clips from users that you follow, valid for 24 hours, in reverse chronological order. Instagram manages to do this very fast and at scale! But how?

We would like you to think about the life cycle from when a user uploads a new story photo or video, to the point when it appears in the stories feed for another user. Which cloud computing services are likely being used along the way that allow it to optimize for speed and scale?

Please create an application flowchart architecture diagram that depicts this lifecycle from story upload to read, and which services are used for which entities and why.

Here are some tips!
- YOUR SUBMISSION CAN BE IN SPANISH
- [Here](https://cloudockit.medium.com/5-tips-for-drawing-organizing-your-aws-architecture-diagrams-1bf1e9d84fd1) are [some](https://davelms.medium.com/taking-a-first-look-at-google-cloud-architecture-diagramming-tool-35a1867356c9) [examples](https://creately.com/guides/aws-architecture-diagrams-and-use-cases/) of architecture diagrams
- We recommend you depict at least 6 difference services, and annotate the flow and services with a phrase about how they're being used specific to the lifecycle of an Instagram story
- We are NOT looking for a perfect solution, especially because there is no best architecture. We are looking for your understanding of how to use common cloud computing services to solve the main performance engineering problems.
- You can do this using any platform: draw the solution on a piece of paper and upload a picture of it, Google Drawings, a free Miro board, or any other virtual whiteboard method.


_The final submission must be a photo file and should NOT be saved in this repository. Please make sure to keep it separate and then upload it in the submission form._

## System Security

In this section, we will want you to demonstrate your knowledge of security best practices. Write your answer to this
question in `security_question.md` either in English or Spanish.

Suppose you are the head of Engineering for an exciting new tech startup that installs solar panels via an app. 
It's Uber for Solar Panels! You are doing a security audit of your app's infrastructure. You are using the OWASP Top 10
for 2021 as a guide for what security issues might be a problem for you. 

Your infrastructure is deployed in Kubernetes containers on Amazon Web Services. It has these components:
- A mobile app for Android and iOS.
- A web frontend that the customer can use instead of the mobile app. This is written in Javascript with Next.js.
- A MySQL database that stores customer information, including passwords, home addresses, telephone numbers, etc. It \
  also contains customer order information.
- A Python backend implemented in FastAPI. This talks to the database and serves data to both the web frontend and the \
  mobile apps. 

You have 12 software engineer employees who have full access to the system, 3 customer support employees who can view
customer information and make changes to orders and accounts, and one sales employee. 

Using the OWASP Top 10, what would you look for to make your system secure?