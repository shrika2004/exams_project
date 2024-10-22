interface Exam{
void subject(){
System.out.println("It is exam time");
}
}

interface Java implementing Exam{
void subject(){
System.out.println("It is java exam");
}
}

interface Data_struct implementing Exam{
void subject(){
System.out.println("It is data structure exam");
}
}

interface OS implementing Exam{
void subject(){
System.out.println("It is OS exam");
}
}

interface SE implementing Exam{
void subject(){
System.out.println("It is SE exam");
}
}

interface College{
public static void main(String[]args){
Exam j = new Java();
Exam d = new Data_struct();
Exam o = new OS();
Exam s = new SE();
j.subject();
d.subject();
o.subject();
s.subject();
}
}





