MVC (Model-View-Controller) загварчлал.

folder structure
Бүтцийн хувьд controller, service, mapper, vo (MVC)

config MyBatisConfig нь MyBatis ORM-тэй холбоотой тохиргоонуудыг хийж байгаа. Mapper доторх query нуудыг уншина гэсэн үг.

mapper 
  MyBatis-ын XML файлууд байна. SQL quyre энд тодорхойлдог

init.sql
  Өгөгдлийн сангийн анхны тохиргооны SQL файлууд. Давуу тал нь 2-оос дээш хүмүүс хоорондоо локол орчинд юм хийж байх 
  үед заавал бааз сервер дээр тавих backup хийх гэх мэт зөрчил үүсэхгүй feild нэмсэн бол нөгөө хүн дээр ажилуулхад шууд бааз 
  дээр үүсэнэ ORM. 


Ашигласан сан
mybatis 

асаах
 docker compose up --build -d
