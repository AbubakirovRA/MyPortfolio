// /**
//  * hierarchy
//  */
// class Client {

//     private String name;
//     private String age;
//     private String passport;
//     private String phone;
    
//     public String getName() {
//         return name;
//     }
//     public String getAge() {
//         return age;
//     }
//     public void setPhone(String phone) {
//         this.phone = phone;
//     }
//     public String getPhone() {
//         return phone;
//     }

//     public String getPassport() {
//         return passport;
//     }
// }

// class Worker {
//     public enum Status{
//         manager, consult;
//     }
//     Status status;
// }


// class Main {

//     static void getInfo(Client client, Worker worker){
//         System.out.printf("name: %s\n", client.getName());
//         System.out.printf("Age: %s\n", client.getAge());
//         System.out.printf("Phone: %s\n", client.getPhone());
//         if (worker.status == Worker.Status.manager){
//             System.out.printf("Passport: '***'");
//         }else{
//             System.out.printf("Passport: %s", client.getPassport());
//         }
//     }

//     static String updateClientPhone(String str, Client client, Worker worker){
//         if (worker.status == Worker.Status.consult && !str.isBlank()){
//             client.setPhone(str);
//         }
//         return client.getPhone();
//     }

// }

