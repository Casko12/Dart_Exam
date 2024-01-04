class Customer{
  int? Id;
  String? FullName;
  DateTime? Birthday;
  String? Address;
  String? PhoneNumber;
  Customer({this.Id, this.FullName, this.Birthday, this.Address, this.PhoneNumber});
  factory Customer.valueFromJson(Map<String,dynamic> json){
    return Customer(
        id: json["Id"] as int,
        fullName: json["FullName"] as String,
        birthday: json["Birthday"] as DateTime,
        address: json["Address"] as String,
        phoneNumber: json["PhoneNumber"] as String
    );
  }
  Map<String, dynamic> toJson() {
    return {
      "Id": Id,
      "Name": FullName,
      "Birthday": Birthday,
      "Address": Address,
      "PhoneNumber": PhoneNumber,
    };
  }
  @override
  String toString(){
    return "id: $id, name:$fullName, birthday:$birthday, address:$address, phoneNumber: $phoneNumber";
  }
}