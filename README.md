Hi! Thanks for downloading ...

If you want to just go right ahead and give this a shot, download the project as a ZIP, unzip and go to the "dist" folder.

I put a shell script for Linux and a batch file for Windows in that folder that will launch the app from the executable jar file.

Obviously, you will need a local JVM on whatever machine you use to run this program.

Best, Mark

UPDATED Sept 24 2014: You can now set and save the sampling size used by the modeling tool when it samples documents from your MongoDB collections. The default is 15. To change the sampling, go to File | Settings. You will see the sampling # being used in the text window at the bottom of the tool window when you click on "Sample Fields".

Here is a video that I uploaded to YouTube to help walk you through how to use this tool to auto-generate and manage Pentaho Mondrian 4 schemas and OLAP4.properties connection settings specific to MongoDB analytics: https://www.youtube.com/watch?v=HxplS24R2G8. 

UPDATED Jan 4 2016: If you are using MongoDB 3.x, please use the MondrianMongoModel2 project which I've comiled against the MongoDB3.2 APIs and tested. It seems that the MongoDB 2.1 APIs are not working against MongoDB3.x. https://github.com/kromerm/MondrianMongoModeler2 
