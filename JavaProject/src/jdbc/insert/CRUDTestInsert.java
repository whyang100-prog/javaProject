package jdbc.insert;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.DBConn;

public class CRUDTestInsert {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        DBConn dbCon = new DBConn();

        try {

            // DB 연결
            con = dbCon.getConnection();

            // Statement 객체 생성
            stmt = con.createStatement();

            // INSERT
            String sql =
                    "INSERT INTO book "
                    + "VALUES('1000','자바개정판','김바로',18000,"
                    + "TO_DATE('2025-01-15','YYYY-MM-DD'),'5','2')";

            int tmpRes = stmt.executeUpdate(sql);

            if(tmpRes == 1) {
                System.out.println("도서 등록 성공");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        // 전체 도서 조회
        try {

            String query = "SELECT * FROM book";

            stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("-----------전체 도서 정보 조회--------------");
            System.out.println(
                "도서번호 \t 도서명 \t\t 저자 \t 가격 \t 발행일 \t 재고 \t 출판사번호"
            );

            while(rs.next()) {

                String bookNo = rs.getString(1);
                String bookName = rs.getString(2);
                String bookAuthor = rs.getString(3);
                int bookPrice = rs.getInt(4);
                Date bookDate = rs.getDate(5);
                int bookStock = rs.getInt(6);
                String pubNo = rs.getString(7);

                System.out.format(
                    "%-10s\t %-20s\t %-10s %6d %13s \t%3d %10s\n",
                    bookNo,
                    bookName,
                    bookAuthor,
                    bookPrice,
                    bookDate,
                    bookStock,
                    pubNo
                );
            }

        } catch(Exception e) {
            System.out.println("오류 발생");
            e.printStackTrace();
        }
    }
}