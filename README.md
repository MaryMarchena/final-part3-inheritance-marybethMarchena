#FINAL PART 3
##Person
-String getNamre()
-String getDetails()
##PersonBaseImpl
-abstract
-String name
-constructor for name
-implement getName()

##Teacher
-extend Person
-String teachedFor()

##TeacherImpl
-extend PersonBaseImpl
-String thoughtCourseTitle
-constructor with super for name
-implement teachesFor()
-implement getDetails()

##Student
-studiesFor()

##StudentImpl
-extend PersonBaseImpl
-String takesCourseTitle
-constructor with super for name
-implement studiesFor()
-implement getDetails()

##MainEntry
-initalize a teacher
-initalize a student
-output names