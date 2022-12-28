package com.example.toeic;

import android.app.Application;

import java.util.ArrayList;

public class App extends Application {

    Database db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = new Database(this);

        db.CreateTable();

        if (db.countTudien() == 0) {
            for (Tudien tudien : init()) {
                db.insertTudien(tudien);
            }
        }
        if (db.countQuestion() == 0) {
            for (Question question : initQ()) {
                db.insertQuestion(question);
            }
        }
        if (db.countVocab() == 0) {
            for (Vocab vocab : initV()) {
                db.insertVocab(vocab);
            }
        }
        if (db.countSenten() == 0) {
            for (Sentences sentences : initS()) {
                db.insertSenten(sentences);
            }
        }
        if (db.countSentences() == 0) {
            for (Senten senten : initSen()) {
                db.insertSent(senten);
            }
        }
        if (db.countSentences() == 0) {
            for (Senten senten : initSen()) {
                db.insertSent(senten);
            }
        }
        if (db.countVocabulary() == 0) {
            for (Vocabulary vocabulary : initVocabulary()) {
                db.insertVocabulary(vocabulary);
            }
        }
        if (db.countTudiens() == 0) {
            for (Tudiens tudiens : initTudiens()) {
                db.insertTudiens(tudiens);
            }
        }
        if (db.countToeic() == 0) {
            for (Toeic toeic : initToeic()) {
                db.insertToeic(toeic);
            }
        }
        if (db.countToefl() == 0) {
            for (Toefl toefl : initToefl()) {
                db.insertToefl(toefl);
            }
        }
        if (db.countIelts() == 0) {
            for (Ielts ielts : initIelts()) {
                db.insertIelts(ielts);
            }
        }

    }

    public static ArrayList<Toeic> initToeic() {
        ArrayList<Toeic> tmp = new ArrayList<>();
        tmp.add(new Toeic("agreement ", "Hợp đồng"));
        tmp.add(new Toeic("assurance ", "Đảm bảo"));
        tmp.add(new Toeic("cancellation ", "Hủy bỏ"));
        tmp.add(new Toeic("determine ", "Quyết định"));
        tmp.add(new Toeic("engage ", "Cam kết"));
        tmp.add(new Toeic("establish ", "Thiết lập"));
        tmp.add(new Toeic("obligate ", "Bắt buộc"));
        tmp.add(new Toeic("party ", "Buổi tiệc"));
        tmp.add(new Toeic("provision ", "Dự trữ"));
        tmp.add(new Toeic("resolve ", "Giải quyết"));
        tmp.add(new Toeic("specific ", "Đặc trưng"));
        tmp.add(new Toeic("attract ", "Thu hút"));
        tmp.add(new Toeic("compare ", "So sánh"));
        tmp.add(new Toeic("competition ", "Cạnh tranh"));
        tmp.add(new Toeic("consume ", "Tiêu dùng"));
        tmp.add(new Toeic("convince ", "Thuyết phục"));
        tmp.add(new Toeic("currently ", "Hiện nay"));
        tmp.add(new Toeic("fad ", "Nhất thời"));
        tmp.add(new Toeic("inspiration ", "Cảm hứng"));
        tmp.add(new Toeic("market ", "Chợ"));
        tmp.add(new Toeic("persuasion ", "Thuyết phục"));
        tmp.add(new Toeic("productive ", "Sản xuất"));
        tmp.add(new Toeic("satisfaction ", "Thỏa mãn"));
        tmp.add(new Toeic("characteristic ", "Đặc trưng"));
        tmp.add(new Toeic("consequence ", "Kết quả"));
        tmp.add(new Toeic("consider ", "Cẩn thận"));
        tmp.add(new Toeic("cover ", "Bảo vệ"));
        tmp.add(new Toeic("expiration ", "Kết thúc"));
        tmp.add(new Toeic("frequently ", "Thường xuyên"));
        tmp.add(new Toeic("imply ", "Ẩn ý"));
        tmp.add(new Toeic("promise ", "Hứa"));
        tmp.add(new Toeic("protect ", "Bảo vệ"));
        tmp.add(new Toeic("reputation ", "Bóc lột"));
        tmp.add(new Toeic("require ", "Yêu cầu"));
        tmp.add(new Toeic("variety ", "Đa dạng"));
        tmp.add(new Toeic("address ", "Địa chỉ"));
        tmp.add(new Toeic("avoid ", "Tránh"));
        tmp.add(new Toeic("demonstrate ", "Chứng minh"));
        tmp.add(new Toeic("develop ", "Phát triển"));
        tmp.add(new Toeic("evaluate ", "Đánh giá"));
        tmp.add(new Toeic("gather ", "Tập hợp"));
        tmp.add(new Toeic("offer ", "Đề xuất"));
        tmp.add(new Toeic("primarily", "Chủ yếu"));
        tmp.add(new Toeic("risk ", "Nguy cơ"));
        tmp.add(new Toeic("strategy ", "Chiến lược"));
        tmp.add(new Toeic("strong ", "Mạnh mẽ"));
        tmp.add(new Toeic("substitution ", "Thay thế"));
        tmp.add(new Toeic("accommodate ", "Điều chỉnh"));
        tmp.add(new Toeic("arrangement ", "Thu xếp"));
        tmp.add(new Toeic("association ", "Đoàn thể"));
        tmp.add(new Toeic("attend ", "Tham dự"));
        tmp.add(new Toeic("hold ", "Giữ"));
        tmp.add(new Toeic("location", "Tọa độ"));
        tmp.add(new Toeic("overcrowded", "Chật ních"));
        tmp.add(new Toeic("register ", "Đăng ký"));
        tmp.add(new Toeic("select ", "Chọn"));
        tmp.add(new Toeic("session ", "Kỳ"));
        return tmp;
    }
    public static ArrayList<Toefl> initToefl() {
        ArrayList<Toefl> tmp = new ArrayList<>();
        tmp.add(new Toefl("promise ", "Hứa"));
        tmp.add(new Toefl("protect ", "Bảo vệ"));
        tmp.add(new Toefl("reputation ", "Bóc lột"));
        tmp.add(new Toefl("require ", "Yêu cầu"));
        tmp.add(new Toefl("variety ", "Đa dạng"));
        tmp.add(new Toefl("address ", "Địa chỉ"));
        tmp.add(new Toefl("avoid ", "Tránh"));
        tmp.add(new Toefl("demonstrate ", "Chứng minh"));
        tmp.add(new Toefl("develop ", "Phát triển"));
        tmp.add(new Toefl("evaluate ", "Đánh giá"));
        tmp.add(new Toefl("gather ", "Tập hợp"));
        tmp.add(new Toefl("offer ", "Đề xuất"));
        tmp.add(new Toefl("primarily", "Chủ yếu"));
        tmp.add(new Toefl("risk ", "Nguy cơ"));
        tmp.add(new Toefl("strategy ", "Chiến lược"));
        tmp.add(new Toefl("strong ", "Mạnh mẽ"));
        tmp.add(new Toefl("substitution ", "Thay thế"));
        tmp.add(new Toefl("accommodate ", "Điều chỉnh"));
        tmp.add(new Toefl("arrangement ", "Thu xếp"));
        tmp.add(new Toefl("association ", "Đoàn thể"));
        tmp.add(new Toefl("attend ", "Tham dự"));
        tmp.add(new Toefl("hold ", "Giữ"));
        tmp.add(new Toefl("location", "Tọa độ"));
        tmp.add(new Toefl("overcrowded", "Chật ních"));
        tmp.add(new Toefl("register ", "Đăng ký"));
        tmp.add(new Toefl("select ", "Chọn"));
        tmp.add(new Toefl("session ", "Kỳ"));
        tmp.add(new Toefl("agreement ", "Hợp đồng"));
        tmp.add(new Toefl("assurance ", "Đảm bảo"));
        tmp.add(new Toefl("cancellation ", "Hủy bỏ"));
        tmp.add(new Toefl("determine ", "Quyết định"));
        tmp.add(new Toefl("engage ", "Cam kết"));
        tmp.add(new Toefl("establish ", "Thiết lập"));
        tmp.add(new Toefl("obligate ", "Bắt buộc"));
        tmp.add(new Toefl("party ", "Buổi tiệc"));

        return tmp;
    }
    public static ArrayList<Ielts> initIelts() {
        ArrayList<Ielts> tmp = new ArrayList<>();
        tmp.add(new Ielts("currently ", "Hiện nay"));
        tmp.add(new Ielts("fad ", "Nhất thời"));
        tmp.add(new Ielts("inspiration ", "Cảm hứng"));
        tmp.add(new Ielts("market ", "Chợ"));
        tmp.add(new Ielts("persuasion ", "Thuyết phục"));
        tmp.add(new Ielts("productive ", "Sản xuất"));
        tmp.add(new Ielts("satisfaction ", "Thỏa mãn"));
        tmp.add(new Ielts("characteristic ", "Đặc trưng"));
        tmp.add(new Ielts("consequence ", "Kết quả"));
        tmp.add(new Ielts("consider ", "Cẩn thận"));
        tmp.add(new Ielts("cover ", "Bảo vệ"));
        tmp.add(new Ielts("expiration ", "Kết thúc"));
        tmp.add(new Ielts("frequently ", "Thường xuyên"));
        tmp.add(new Ielts("imply ", "Ẩn ý"));
        tmp.add(new Ielts("promise ", "Hứa"));
        tmp.add(new Ielts("protect ", "Bảo vệ"));
        tmp.add(new Ielts("reputation ", "Bóc lột"));
        tmp.add(new Ielts("require ", "Yêu cầu"));
        tmp.add(new Ielts("variety ", "Đa dạng"));
        tmp.add(new Ielts("address ", "Địa chỉ"));
        tmp.add(new Ielts("agreement ", "Hợp đồng"));
        tmp.add(new Ielts("assurance ", "Đảm bảo"));
        tmp.add(new Ielts("cancellation ", "Hủy bỏ"));
        tmp.add(new Ielts("determine ", "Quyết định"));
        tmp.add(new Ielts("engage ", "Cam kết"));
        tmp.add(new Ielts("establish ", "Thiết lập"));
        tmp.add(new Ielts("obligate ", "Bắt buộc"));
        tmp.add(new Ielts("party ", "Buổi tiệc"));
        tmp.add(new Ielts("provision ", "Dự trữ"));
        tmp.add(new Ielts("resolve ", "Giải quyết"));
        tmp.add(new Ielts("specific ", "Đặc trưng"));
        tmp.add(new Ielts("attract ", "Thu hút"));
        tmp.add(new Ielts("compare ", "So sánh"));
        return tmp;
    }

// tra tu dien , search
    public static ArrayList<Tudien> init() {
        ArrayList<Tudien> tmp = new ArrayList<>();
        tmp.add(new Tudien("Multiplication", "Phép nhân", 1));
        tmp.add(new Tudien("Numeric", "Số học", 2));
        tmp.add(new Tudien("Operation", "Thao tác", 3));
        tmp.add(new Tudien("Output", "Ra, đưa ra", 4));
        tmp.add(new Tudien("Perform", "Tiến hành, thi hành", 5));
        tmp.add(new Tudien("Process", "Xử lý", 6));
        tmp.add(new Tudien("Processor", "Bộ xử lý", 7));
        tmp.add(new Tudien("Pulse", "Xung", 8));
        tmp.add(new Tudien("Register", "Thanh ghi, đăng ký", 9));
        tmp.add(new Tudien("Signal", "Tín hiệu", 10));
        tmp.add(new Tudien("Solution", "Giải pháp, lời giải", 11));
        tmp.add(new Tudien("Store", "Lưu trữ", 12));
        tmp.add(new Tudien("Subtraction", "Phép trừ", 13));
        tmp.add(new Tudien("Switch", "Chuyển", 14));
        tmp.add(new Tudien("Tape", "Ghi băng, băng", 15));
        tmp.add(new Tudien("Terminal", "Máy trạm", 16));
        tmp.add(new Tudien("Transmit", "Truyền", 17));
        tmp.add(new Tudien("Abacus", "Bàn tính", 18));
        tmp.add(new Tudien("Allocate", "Phân phối", 19));
        tmp.add(new Tudien("Analog", "Tương tự", 20));
        tmp.add(new Tudien("Application", "Ứng dụng", 21));
        tmp.add(new Tudien("Binary", "Nhị phân, thuộc về nhị phân", 22));
        tmp.add(new Tudien("Calculation", "Tính toán", 23));
        tmp.add(new Tudien("Command", "Ra lệnh, lệnh (trong máy tính)", 24));
        tmp.add(new Tudien("Dependable", "Có thể tin cậy được", 25));
        tmp.add(new Tudien("Devise", "Phát minh", 26));
        tmp.add(new Tudien("Different", "Khác biệt", 27));
        tmp.add(new Tudien("Digital", "Số, thuộc về số", 28));
        tmp.add(new Tudien("Etch", "Khắc axit", 29));
        tmp.add(new Tudien("Experiment", "Tiến hành thí nghiệm, cuộc thí nghiệm", 30));
        tmp.add(new Tudien("Remote Access", "Truy cập từ xa qua mạng", 31));
        tmp.add(new Tudien("Computerize", "Tin học hóa", 32));
        tmp.add(new Tudien("Storage", "Lưu trữ", 33));
        tmp.add(new Tudien("Figure out", "Tính toán, tìm ra", 34));
        tmp.add(new Tudien("Generation", "Thế hệ", 35));
        tmp.add(new Tudien("History", "Lịch sử", 36));
        tmp.add(new Tudien("Imprint", "In, khắc", 37));
        tmp.add(new Tudien("Integrate", "Tích hợp", 38));
        tmp.add(new Tudien("Invention", "Phát minh", 39));
        tmp.add(new Tudien("Layer", "Tầng, lớp", 40));
        tmp.add(new Tudien("Mainframe computer", "Máy tính lớn", 41));
        tmp.add(new Tudien("Ability", "Khả năng", 42));
        tmp.add(new Tudien("Access", "Truy cập", 43));
        tmp.add(new Tudien("Acoustic coupler", "Bộ ghép âm", 44));
        tmp.add(new Tudien("Analyst", "Nhà phân tích", 45));
        tmp.add(new Tudien("Centerpiece", "Mảnh trung tâm", 46));
        tmp.add(new Tudien("Channel", "Kênh", 47));
        tmp.add(new Tudien("Characteristic", "Thuộc tính", 48));
        tmp.add(new Tudien("Cluster controller", "Bộ điều khiển trùm", 49));
        tmp.add(new Tudien("Consist", "Bao gồm", 50));
        tmp.add(new Tudien("Convert", "Chuyển đổi", 51));
        tmp.add(new Tudien("Equipment", "Trang thiết bị", 52));
        tmp.add(new Tudien("Multiplexor", "Bộ dồn kênh", 53));
        tmp.add(new Tudien("Network", "Mạng", 54));
        tmp.add(new Tudien("Peripheral", "Ngoại vi", 55));
        tmp.add(new Tudien("Reliability", "Sự có thể tin cậy được", 56));
        tmp.add(new Tudien("Single-purpose", "Đơn mục đích", 57));
        tmp.add(new Tudien("Teleconference", "Hội thảo từ xa", 58));
        tmp.add(new Tudien("Arithmetic", "Số học", 59));
        return tmp;
    }
    public static ArrayList<Tudiens> initTudiens() {
        ArrayList<Tudiens> tmp = new ArrayList<>();
        tmp.add(new Tudiens("Multiplication", "DANH TU", "Sự nhân", "phép nhân", 1));
        tmp.add(new Tudiens("Numeric", "TINHTU", "Số học", "Thuộc về số học", 2));
        tmp.add(new Tudiens("Operation", "DANHTU", "Sự hoạt động, quá trình hoạt động", "Hiệu quả, tác dụng", 3));
        tmp.add(new Tudiens("Output", "DANHTU", "Ra", "Đưa ra", 4));
        tmp.add(new Tudiens("Perform", "DONGTU", "Tiến hành", "Thi hành", 5));
        tmp.add(new Tudiens("Process", "DONGTU", "Xử lý", "Quy trình", 6));
        tmp.add(new Tudiens("Processor", "DANHTU", "Bộ xử lý", "Máy chế biến", 7));
        tmp.add(new Tudiens("Pulse", "DANHTU", "Xung", "Nhịp đập, mạch", 8));
        tmp.add(new Tudiens("Register", "DANHTU", "Thanh ghi", "Đăng ký", 9));
        tmp.add(new Tudiens("Signal", "DANHTU", "Tín hiệu", "Hiệu lệnh", 10));
        tmp.add(new Tudiens("Solution", "DANHTU", "Giải pháp", "sự hòa tan", 11));
        tmp.add(new Tudiens("Store", "DANHTU", "Lưu trữ", "Cửa hàng", 12));
        tmp.add(new Tudiens("Subtraction", "DANHTU", "Sự trừ", "Phép trừ", 13));
        tmp.add(new Tudiens("Switch", "DONGTU", "Chuyển", "công tắt đèn", 14));
        tmp.add(new Tudiens("Tape", "DANHTU", "Dây, dải", "Băng", 15));
        tmp.add(new Tudiens("Terminal", "DANHTU", "Máy trạm", "Phần cuối", 16));
        tmp.add(new Tudiens("Transmit", "DONGTU", "Truyền", "Phát", 17));
        tmp.add(new Tudiens("Abacus", "DANHTU", "Bàn tính", "Đỉnh cột", 18));
        tmp.add(new Tudiens("Allocate", "DONGTU", "Phân phối", "Chỉ định", 19));
        tmp.add(new Tudiens("Analog", "DONGTU", "Tương tự", "Tương tự", 20));
        tmp.add(new Tudiens("Application", "DANHTU", "sự gắn vào", "lời thỉnh cầu", 21));
        tmp.add(new Tudiens("Binary", "TINHTU", "Nhị phân", "Đôi", 22));
        tmp.add(new Tudiens("Calculation", "DANHTU", "Sự cân nhắc", "Sự tính toán", 23));
        tmp.add(new Tudiens("Command", "DANHTU", "Lệnh", "Sự làm chủ", 24));
        tmp.add(new Tudiens("Dependable", "TINHTU", "Có thể tin được", "Đáng tin cậy", 25));
        tmp.add(new Tudiens("Devise", "DANHTU", "Sự để lại", "Di sản", 26));
        tmp.add(new Tudiens("Different", "TINHTU", "Tách ra", "Khác rõ rệt", 27));
        tmp.add(new Tudiens("Digital", "DANHTU", "Số", "Phím", 28));
        tmp.add(new Tudiens("Etch", "DONGTU", "Khắc axit", "Khắc", 29));
        tmp.add(new Tudiens("Experiment", "DANHTU", "Cuộc thí nghiệm", "Cuộc thử nghiệm", 30));
        tmp.add(new Tudiens("Remote Access", "DANHTU", "Truy cập từ xa qua mạng", "Truy cập từ xa qua mạng", 31));
        tmp.add(new Tudiens("Computerize", "DONGTU", "Tin học hóa", "Tin học hóa", 32));
        tmp.add(new Tudiens("Storage", "DANHTU", "Sự cất giữ", "Lưu trữ", 33));
        tmp.add(new Tudiens("Figure out", "DANHTU", "Tính toán", "Tìm ra", 34));
        tmp.add(new Tudiens("Generation", "DANHTU", "Sự sinh ra", "Thế hệ", 35));
        tmp.add(new Tudiens("History", "DANHTU", "Lịch sử", "Môn lịch sử", 36));
        tmp.add(new Tudiens("Imprint", "DANHTU", "In", "Khắc", 37));
        tmp.add(new Tudiens("Integrate", "DONGTU", "Tích hợp", "Hòa nhập", 38));
        tmp.add(new Tudiens("Invention", "DANHTU", "Sự phát minh", "Sự sáng chế", 39));
        tmp.add(new Tudiens("Layer", "DANHTU", "Tầng", "Lớp", 40));
        tmp.add(new Tudiens("Mainframe computer", "DANHTU", "Máy tính lớn", "Máy tính chính", 41));
        tmp.add(new Tudiens("Ability", "DANHTU", "Sự khéo léo", "Tài năng", 42));
        tmp.add(new Tudiens("Access", "DANHTU", "Truy cập", "Sự truy cập", 43));
        tmp.add(new Tudiens("Acoustic coupler", "TINHTU", "Bộ ghép âm", "Ghép âm thanh", 44));
        tmp.add(new Tudiens("Analyst", "DANHTU", "Nhà phân tích", "Người phân tích", 45));
        tmp.add(new Tudiens("Centerpiece", "DANHTU", "Mảnh trung tâm", "Trung tâm", 46));
        tmp.add(new Tudiens("Channel", "DANHTU", "Kênh", "Lòng sông", 47));
        tmp.add(new Tudiens("Characteristic", "DANHTU", "Nét đặc trưng", "Đặc điểm", 48));
        tmp.add(new Tudiens("Cluster controller", "DANHTU", "Bộ điều khiển trùm", "Bộ điều khiển trùm", 49));
        tmp.add(new Tudiens("Consist", "DONHTU", "Bao gồm", "Phù hợp", 50));
        tmp.add(new Tudiens("Convert", "DONGTU", "Chuyển", "Biến đổi", 51));
        tmp.add(new Tudiens("Equipment", "DANHTU", "Trang thiết bị", "Sự trang bị", 52));
        tmp.add(new Tudiens("Multiplexor", "TINHTU", "Bộ dồn kênh", "Nhiều kênh", 53));
        tmp.add(new Tudiens("Network", "DANHTU", "Mạng", "Mạng lưới", 54));
        tmp.add(new Tudiens("Peripheral", "TINHTU", "Ngoại vi", "Chu vi", 55));
        tmp.add(new Tudiens("Reliability", "DANHTU", "Sự đáng tin cậy", "Tính đáng tin cậy", 56));
        tmp.add(new Tudiens("Single-purpose", "TINHTU", "Đơn mục đích", "Chuyên dùng", 57));
        tmp.add(new Tudiens("Teleconference", "DANHTU", "Hội thảo từ xa", "Các cuộc hợp được tổ chức qua điện thoại", 58));
        tmp.add(new Tudiens("Arithmetic", "DANHTU", "Số học", "Sự tính", 59));
        return tmp;
    }
    // vocab 1
    public static ArrayList<Vocab> initV() {
        ArrayList<Vocab> tmp = new ArrayList<>();
        tmp.add(new Vocab("TOPIC 1: RAU CỦ QUẢ", "Celery - Cần tây", "Cabbage - Bắp cải", 1));
        tmp.add(new Vocab("TOPIC 2: ĐỘNG VẬT", "Dog - Con chó", "Cat - Con mèo", 2));
        tmp.add(new Vocab("TOPIC 3: CÔNG NGHỆ", "Abacus - Bàn tính", "Appliance - Thiết bị, máy móc", 3));
        tmp.add(new Vocab("TOPIC 4: NGHỀ NGHIỆP", "Programme - Lập trình viên", "Software developer - Nhân viên phát triển phần mềm", 4));
        tmp.add(new Vocab("TOPIC 5: CƠ THỂ NGƯỜI", "Face - Mặt", "Neck - Cổ", 5));
        tmp.add(new Vocab("TOPIC 6: GIA ĐÌNH", "Parents - Ba mẹ", "Stepparent - Cha mẹ kế", 6));
        tmp.add(new Vocab("TOPIC 7: THỂ THAO", "Football - Môn bóng đá", "Volleyball - Môn bóng chuyền", 7));
        tmp.add(new Vocab("TOPIC 8: NHÀ BẾP", "Apron - Apron", "Breadbasket - Breadbasket", 8));
        tmp.add(new Vocab("TOPIC 9: THỜI GIAN", "Monday - Thứ hai", "Tuesday - Thứ ba", 9));
        tmp.add(new Vocab("TOPIC 10: ẨM THỰC TẾT", "Boiled chicken - Gà luộc", "Cashew nut - Hạt điều", 10));

        return tmp;
    }
//

    //vocab 2
    public static ArrayList<Vocabulary> initVocabulary() {
        ArrayList<Vocabulary> tmp = new ArrayList<>();
        tmp.add(new Vocabulary("TOPIC 1: RAU CỦ QUẢ", "Celery - Cần tây", "Cabbage - Bắp cải", "Cauliflower - Súp lơ", "Corn - Ngô", "Marrow - Quả bí xanh", "Tomato - Quả cà chua", "Radish - Củ cải", "Eggplant - Cà tím", "Seaweed - Rong biển", 1));
        tmp.add(new Vocabulary("TOPIC 2: ĐỘNG VẬT", "Dog - Con chó", "Cat - Con mèo", "Camel - Con lạc đà", "White mouse - Con chuột bạch", "Dove - Bồ câu", "Duck - Con vịt", "Lion - Con sư tử", "Bear - Con gấu", "Elephant - Elephant", 2));
        tmp.add(new Vocabulary("TOPIC 3: CÔNG NGHỆ", "Abacus - Bàn tính", "Appliance - Thiết bị, máy móc", "Circuit - Mạch", "Disk - Đĩa", "Memory - Bộ nhớ", "Software - Phần mềm", "Equipment - Thiết bị", "Keyboard - Bàn phím", "Screen - Màn hình", 3));
        tmp.add(new Vocabulary("TOPIC 4: NGHỀ NGHIỆP", "Programme - Lập trình viên", "Software developer - Nhân viên phát triển phần mềm", "Web develope - Nhân viên phát triển mạng", "Database administrator - Nhân viên quản lý dữ liệu", "Web designer  - Web designer", "Computer software engineer - Kĩ sư phần mềm máy tính", "Doctor - Bác sĩ", "Baker - Thợ làm bánh", "Tailor - Thợ may", 4));
        tmp.add(new Vocabulary("TOPIC 5: CƠ THỂ NGƯỜI", "Face - Mặt", "Neck - Cổ", "Mouth - Miệng", "Arm - Tay", "Leg - Đôi chân", "Heart - Tim", "Stomach - Dạ dày", "Vein - Tĩnh mạch", "Artery - Động mạch", 5));
        tmp.add(new Vocabulary("TOPIC 6: GIA ĐÌNH", "Parents - Ba mẹ", "Stepparent - Cha mẹ kế", "Mother - Mẹ", "Father - Bố", "Sibling - Anh chị em ruột", "Spouse - Vợ chồng", "Husband - Chồng", "Wife - Vợ", "Daughter - Con gái", 6));
        tmp.add(new Vocabulary("TOPIC 7: THỂ THAO", "Football - Môn bóng đá", "Volleyball - Môn bóng chuyền", "Basketball - Bóng rổ", "Baseball - Bóng chày", "Badminton - Cầu lông", "Fishing - Câu cá", "Eurythmics - Thể dục nhịp điệu", "Weightlifting - Cử tạ", "Skateboarding - Trượt ván", 7));
        tmp.add(new Vocabulary("TOPIC 8: NHÀ BẾP", "Apron - Apron", "Breadbasket - Breadbasket", "Bowl - Bát", "Teapot - Teapot", "Spice container - Hộp gia vị", "Corkscrew - Đồ mở nắp chai", "Frying pan - Chảo chiên", "Cooker - Nồi cơm điện", "Chopsticks - Đũa", 8));
        tmp.add(new Vocabulary("TOPIC 9: THỜI GIAN", "Monday - Thứ hai", "Tuesday - Thứ ba", "Wednesday - Thứ tư", "Thursday - Thứ năm", "Friday - Thứ sáu", "Saturday - Thứ bảy", "Sunday - Chủ nhật", "Every day or daily - Hàng ngày", "Every week or weekly - Hàng tuần", 9));
        tmp.add(new Vocabulary("TOPIC 10: ẨM THỰC TẾT", "Boiled chicken - Gà luộc", "Cashew nut - Hạt điều", "Pickled onion - Dưa hành", "Five fruit tray - Giò lụa", "Five fruit tray - Mâm ngũ quả", "Jellied meat - Thịt đông", "Steamed sticky rice - Xôi", "Spring roll - Nem rán", "Dried bamboo shoots soup - Canh măng khô", 10));
        return tmp;
    }
//senten 1
    public static ArrayList<Sentences> initS() {
        ArrayList<Sentences> tmp = new ArrayList<>();
        tmp.add(new Sentences("TOPIC 1 :Giao tiếp Chào hỏi", "Hello – Xin chào", "Are you Canadian? – Bạn là người Canada phải không?", 1));
        tmp.add(new Sentences("TOPIC 2 :Giao tiếp Gia đình", "Do you have any brothers or sisters? – Bạn có anh chị em không?", "Have you got any kids? – Bạn có con không?", 2));
        tmp.add(new Sentences("TOPIC 3 :Giao tiếp Trường học", "This is my classmate – Đây là bạn học của tôi", "It’s time your break now – Đến giờ giải lao rồi", 3));
        tmp.add(new Sentences("TOPIC 4 :Giao tiếp Nhà hàng", "We haven’t booked a table yet, can you fit us? – Chúng tôi chưa đặt bàn? Làm ơn xếp chỗ cho chúng tôi", "I booked a table for two at 7pm. It’s under the name of … – Tôi đã đặt một bàn 2 người lúc 7 giờ tối, tên tôi là…", 4));
        tmp.add(new Sentences("TOPIC 5 :Giao tiếp Du lịch", "Can we have an extra chair, please? – Cho tôi xin thêm một cái ghế nữa", "Are there any interesting attractions there? – Ở đó có địa điểm du lịch nào thú vị không?", 5));
        tmp.add(new Sentences("TOPIC 6 :Giao tiếp Mua sắm", "Excuse me, can you help me please? – Xin lỗi, bạn có thể giúp tôi không?", "I’m just looking – Tôi đang xem một chút", 6));
        tmp.add(new Sentences("TOPIC 7 :Giao tiếp Hỏi đường", "I’m just looking – Tôi đang xem một chút", "Sorry, I don’t live around here – Xin lỗi, tôi không sống ở khu này", 7));
        return tmp;
    }
//senten2
    public static ArrayList<Senten> initSen() {
        ArrayList<Senten> tmp = new ArrayList<>();
        tmp.add(new Senten("TOPIC 1 :Giao tiếp Chào hỏi", "Hello – Xin chào", "Are you Canadian? – Bạn là người Canada phải không?", "Where are you coming from? – Bạn đến từ đâu?", "Glad to meet you – Rất vui được gặp bạn", "I don’t understand English well – Tôi không giỏi tiếng Anh lắm", "Please speak more slowly – Bạn có thể nói chậm một chút không?", "Can you repeat? – Bạn có thể lặp lại không?", "Can I help you? – Tôi giúp gì được cho bạn?", "How do you do? – Dạo này thế nào?", 1));
        tmp.add(new Senten("TOPIC 2 :Giao tiếp Gia đình", "I’m an only child  – Tôi là con một", "Do you have any brothers or sisters? – Bạn có anh chị em không?", "I’ve got a baby – Tôi mới có một em bé", "Have you got any kids? – Bạn có con không?", "Where do your parents live? – Bố mẹ bạn sống ở đâu?", "Are you married? – Bạn có gia đình chưa?", "How long have you been married? – Bạn lập gia đình bao lâu rồi?", "I’m divorced – Tôi đã ly hôn", "Could you tell me about your family? – Bạn chia sẻ một chút về gia đình mình với tôi được không?", 2));
        tmp.add(new Senten("TOPIC 3 :Giao tiếp Trường học", "This is my classmate – Đây là bạn học của tôi", "It’s time your break now – Đến giờ giải lao rồi", "What’s your major? – Bạn học ngành gì vậy?", "I’m a second year student – Tôi là sinh viên năm 2", "Which university do you want to get in? – Bạn muốn thi trường đại học nào?", "What subject do you like? Bạn thích môn gì?", "Can I borrow your pencil? – Cho mình mượn bút chì được không?", "Do you understand what the teacher said? – Bạn có hiểu cô giáo nói gì không?", "I forgot my books for the math class – Tớ quên không mang sách toán rồi", 3));
        tmp.add(new Senten("TOPIC 4 :Giao tiếp Nhà hàng", "We haven’t booked a table yet, can you fit us? – Chúng tôi chưa đặt bàn? Làm ơn xếp chỗ cho chúng tôi", "I booked a table for two at 7pm. It’s under the name of … – Tôi đã đặt một bàn 2 người lúc 7 giờ tối, tên tôi là…", "Can we have an extra chair, please? – Cho tôi xin thêm một cái ghế nữa", "Can we have a look at the menu? – Cho chúng tôi xem thực đơn với", "What’s special for today? – Hôm nay có món gì đặc biệt?", "Can you bring me a spoon, please? – Lấy giúp một cái thìa với", "Could you pass me the ketchup, please? – Lấy giúp tôi lọ tương cà", "Excuse me, but my meat is cold – Thịt của tôi bị nguội rồi", "Can I pay by credit card? – Tôi có thể trả bằng thẻ tín dụng không?", 4));
        tmp.add(new Senten("TOPIC 5 :Giao tiếp Du lịch", "Can we have an extra chair, please? – Cho tôi xin thêm một cái ghế nữa", "Are there any interesting attractions there? – Ở đó có địa điểm du lịch nào thú vị không?", "How much is the fare? – Giá vé bao nhiêu?", "How much is the guide fee per day? – Tiền phí hướng dẫn viên một ngày là bao nhiêu?", "What’s special product here? – Ở đây có đặc sản nổi tiếng gì?", "Is there any goods restaurants here? – Ở đây có nhà hàng nào ngon?", "I’d like to buy some souvenirs – Tôi muốn mua 1 số món đồ lưu niệm", "We took a lot of pictures – Chúng tôi đã chụp rất nhiều ảnh", "What is the city famous for? -Thành phố đó nổi tiếng về cái gì?", 5));
        tmp.add(new Senten("TOPIC 6 :Giao tiếp Mua sắm", "Excuse me, can you help me please? – Xin lỗi, bạn có thể giúp tôi không?", "I’m just looking – Tôi đang xem một chút", "How much is this? – Cái này giá bao nhiêu?", "Can I have discount for this? – Cái này có được giảm giá không?", "What size is it? – Cái này cỡ bao nhiêu?", "Do you have this in a size L – Cái này có size L không?", "Have you got that shirt in a smaller size? –  Cái áo đó có cỡ nhỏ hơn không?", "Can I try this on? – Tôi có thể thử cái này không?", "I’ll take it – Tôi lấy cái này", 6));
        tmp.add(new Senten("TOPIC 7 :Giao tiếp Hỏi đường", "I’m just looking – Tôi đang xem một chút", "Sorry, I don’t live around here – Xin lỗi, tôi không sống ở khu này", "Are we on the right road for? – Chúng ta đang đi đúng đường đó chứ?", "Excuse me, can you tell me where am I – Cho tôi hỏi đây là đâu?", "Please show me the way – Làm ơn giúp chỉ đường", "Where should I turn? – Tôi phải rẽ ở đâu?", "What is this street? – Đường này là đường gì?", "Turn left at the crossroads – Rẽ trái ở ngã tư", "Straight ahead for about 100m – Cứ đi thẳng 100m nữa", 7));
        return tmp;
    }

    // bo de 1
    public static ArrayList<Question> initQ() {
        ArrayList<Question> tmp = new ArrayList<>();
//      tmp.add(new Question("cauhoi1", R.drawable.vocab,R.raw.gapem, "option1", "option2", "option3", "option4", 3, 1));
        tmp.add(new Question("What is the handle's color of this kettle?", R.drawable.a1, "It is a silver kettle.", "It is the black handle.", "It is used to boil water.", "It is useful.", 3, 1)); //hinh1
        tmp.add(new Question("How many pins can you see in this hilt of the knife?", R.drawable.a2, "It is a sharp knife.", "There is one knife in this picture.", "There are half of six pins.", "It is black hilt.", 3, 1)); //hinh2
        tmp.add(new Question("What is this used to do?", R.drawable.a3, "This lamp is used to light roads.", "It is used to put in bed room like a night-lamp.", "It is quite expensive.", "This lamp is often used to light in restroom.", 3, 1)); //hinh3
        tmp.add(new Question("What is in front of the maid in this picture?", R.drawable.a4, "Another room", "A chair", "A white sofa", "A window", 3, 1)); //hinh4
        tmp.add(new Question("What is the shape of this microwave oven?", R.drawable.a5, "Triangle", "Cuboid", "Cube", "Trapezium", 3, 1)); //hinh5
        tmp.add(new Question("Where does this animal often live?", R.drawable.a6, "It often lives in land where is always wet.", "It often lives in dry land like desert.", "It lives easily in water.", "It can live in anywhere as long as there is not water.", 3, 1)); //hinh6
        tmp.add(new Question("What is the pink thing behind the two lovely cats?", R.drawable.a7, "A bamboo", "A shrift", "A flower", "A dinosaur", 3, 1)); //hinh7
        tmp.add(new Question("Which direction is this chick looking?", R.drawable.a8, "The chick is standing.", "It is looking on your left hand side.", "It looks so beautiful.", "It is a chick.", 3, 1)); //hinh8
        tmp.add(new Question("What is the sex of this chicken?", R.drawable.a9, "It is a cock.", "It is a hen.", "It is a male chicken.", "It isn't a female chicken.", 3, 1)); //hinh9
        tmp.add(new Question("In which is this beautiful cock?", R.drawable.a10, "It is standing in a luxurious house.", "It is in a garden.", "It is bare in a pot.", "It is looking forward to seeing a hen.", 3, 1)); //hinh10
        tmp.add(new Question("Chase", "v. to come to the earth from the air", "ad. not military", "n. the center part of an atom or cell", "v. to run or go after someone or something", 3, 1));
        tmp.add(new Question("Rate", "n. speed; a measure of how quickly or how often something happens", "v. to free; to permit to go", "n. a center where people live, larger than a village but not as large as a city", "n. one sent to act for another; one who represents another", 3, 1));
        tmp.add(new Question("Agency", "n. a male with the same father or mother as another person", "ad. having no fear", "n. one who guides or flies an airplane or helicopter", "n. an organization that is part of a larger group", 3, 1));
        tmp.add(new Question("Same", "ad. as is normal or common; as is most often done, seen or heard", "n. a business organized for trade, industrial or other purposes", "ad. not different; not changed", "v. to take away or take off; to put an end to", 3, 1));
        tmp.add(new Question("Open", "v. to start", "n. something built to travel on water that carries people or goods", "n. the telling or writing of an event, either real or imagined", "n. a spending plan", 3, 1));
        tmp.add(new Question("Transportation", "n. power used to do work, usually with machines; the ability and willingness to be active", "v. to go from one place to another, usually for a long distance", "n. the act or business of moving goods or people", "v. to make a person or animal a prisoner; to seize or take by force", 3, 1));
        tmp.add(new Question("Condition", "n. this day", "n. something declared necessary to complete an agreement; a person's health", "v. to take part in; to become a part of", "n. a drink made from the plant of the same name", 3, 1));
        tmp.add(new Question("Hijack", "v. to move forces or weapons into positions for action", "n. a person who is a member of a country by birth or by law", "v. to seize or take control of a vehicle by force", "v. to fail to obey or honor; to break (an agreement)", 3, 1));
        tmp.add(new Question("Airplane", "n. a vehicle with wings that flies", "n. a fight; a battle, especially a long one", "n. something that shows what another thing looks like; an idea or representation of something as seen by the eye", "n. a fight between opposing armed forces", 3, 1));
        tmp.add(new Question("Bleed", "n. fighting between nations, or groups in a nation, using weapons", "v. to lose blood", "n. a person one likes and trusts", "n. a device that measures and shows time", 3, 1));
        tmp.add(new Question("In a game of singles, two players play ____ each other.", "against", "true", "play", "zone", 3, 1));
        tmp.add(new Question("I'm not very fond ___ detective stories.", "of", "in", "so", "before", 3, 1));
        tmp.add(new Question("Margarine is different ___ butter.", "from", "an", "a", "the", 3, 1));
        tmp.add(new Question("His parents are very strict ___ him.", "with", "from", "about", "the", 3, 1));
        tmp.add(new Question("Many people take part ___ jogging every morning.", "in", "on", "at", "of", 3, 1));
        tmp.add(new Question("We'd like a walk instead ___ riding a bike.", "of", "for", "in", "out", 3, 1));
        tmp.add(new Question("Henry is very good ___ fixing things.", "at", "on", "in", "of", 3, 1));
        tmp.add(new Question("They study and listen to music ___ the same time.", "at", "ob", "to", "in", 3, 1));
        tmp.add(new Question("___ literature, we learn about books and write essays.", "in", "on", "at", "for", 3, 1));
        tmp.add(new Question("Will you be home ___ dinner tonight?", "for", "in", "at", "of", 3, 1));
        tmp.add(new Question("What was wrong with ________ ? He had a bad cold.", "he", "she", "his", "him", 3, 1));
        tmp.add(new Question("This is my father. _______ is a farmer.", "he", "she", "his", "him", 3, 1));
        tmp.add(new Question("This is Mr. Bob. _________ is a doctor .", "he", "she", "his", "him", 3, 1));
        tmp.add(new Question("This is my father________name is Harry.", "he", "she", "his", "him", 3, 1));
        tmp.add(new Question("John brushes _________ teeth.", "he", "she", "his", "him", 3, 1));
        tmp.add(new Question("He doesn't have ________ timetable.", "he", "she", "his", "him", 3, 1));
        tmp.add(new Question("Peter is doing_________ homework.", "he", "she", "his", "him", 3, 1));
        tmp.add(new Question("What's your father's name?______ name is Henry.", "he", "she", "his", "him", 3, 1));
        tmp.add(new Question("________ father is a doctor.", "he", "she", "his", "him", 3, 1));
        tmp.add(new Question("He is a doctor, __________ name is Peter.", "he", "she", "his", "him", 3, 1));


        //bo de 2
        tmp.add(new Question("What is the handle's color of this kettle?", R.drawable.a1, "It is a silver kettle.", "It is the black handle.", "It is used to boil water.", "It is useful.", 3, 2)); //hinh1
        tmp.add(new Question("How many pins can you see in this hilt of the knife?", R.drawable.a2, "It is a sharp knife.", "There is one knife in this picture.", "There are half of six pins.", "It is black hilt.", 3, 2)); //hinh2
        tmp.add(new Question("What is this used to do?", R.drawable.a3, "This lamp is used to light roads.", "It is used to put in bed room like a night-lamp.", "It is quite expensive.", "This lamp is often used to light in restroom.", 3, 2)); //hinh3
        tmp.add(new Question("What is in front of the maid in this picture?", R.drawable.a4, "Another room", "A chair", "A white sofa", "A window", 3, 2)); //hinh4
        tmp.add(new Question("What is the shape of this microwave oven?", R.drawable.a5, "Triangle", "Cuboid", "Cube", "Trapezium", 3, 2)); //hinh5
        tmp.add(new Question("Where does this animal often live?", R.drawable.a6, "It often lives in land where is always wet.", "It often lives in dry land like desert.", "It lives easily in water.", "It can live in anywhere as long as there is not water.", 3, 2)); //hinh6
        tmp.add(new Question("What is the pink thing behind the two lovely cats?", R.drawable.a7, "A bamboo", "A shrift", "A flower", "A dinosaur", 3, 2)); //hinh7
        tmp.add(new Question("Which direction is this chick looking?", R.drawable.a8, "The chick is standing.", "It is looking on your left hand side.", "It looks so beautiful.", "It is a chick.", 3, 2)); //hinh8
        tmp.add(new Question("What is the sex of this chicken?", R.drawable.a9, "It is a cock.", "It is a hen.", "It is a male chicken.", "It isn't a female chicken.", 3, 2)); //hinh9
        tmp.add(new Question("In which is this beautiful cock?", R.drawable.a10, "It is standing in a luxurious house.", "It is in a garden.", "It is bare in a pot.", "It is looking forward to seeing a hen.", 3, 2)); //hinh10
        tmp.add(new Question("Chase", "v. to come to the earth from the air", "ad. not military", "n. the center part of an atom or cell", "v. to run or go after someone or something", 3, 2));
        tmp.add(new Question("Rate", "n. speed; a measure of how quickly or how often something happens", "v. to free; to permit to go", "n. a center where people live, larger than a village but not as large as a city", "n. one sent to act for another; one who represents another", 3, 2));
        tmp.add(new Question("Agency", "n. a male with the same father or mother as another person", "ad. having no fear", "n. one who guides or flies an airplane or helicopter", "n. an organization that is part of a larger group", 3, 2));
        tmp.add(new Question("Same", "ad. as is normal or common; as is most often done, seen or heard", "n. a business organized for trade, industrial or other purposes", "ad. not different; not changed", "v. to take away or take off; to put an end to", 3, 2));
        tmp.add(new Question("Open", "v. to start", "n. something built to travel on water that carries people or goods", "n. the telling or writing of an event, either real or imagined", "n. a spending plan", 3, 2));
        tmp.add(new Question("Transportation", "n. power used to do work, usually with machines; the ability and willingness to be active", "v. to go from one place to another, usually for a long distance", "n. the act or business of moving goods or people", "v. to make a person or animal a prisoner; to seize or take by force", 3, 2));
        tmp.add(new Question("Condition", "n. this day", "n. something declared necessary to complete an agreement; a person's health", "v. to take part in; to become a part of", "n. a drink made from the plant of the same name", 3, 2));
        tmp.add(new Question("Hijack", "v. to move forces or weapons into positions for action", "n. a person who is a member of a country by birth or by law", "v. to seize or take control of a vehicle by force", "v. to fail to obey or honor; to break (an agreement)", 3, 2));
        tmp.add(new Question("Airplane", "n. a vehicle with wings that flies", "n. a fight; a battle, especially a long one", "n. something that shows what another thing looks like; an idea or representation of something as seen by the eye", "n. a fight between opposing armed forces", 3, 2));
        tmp.add(new Question("Bleed", "n. fighting between nations, or groups in a nation, using weapons", "v. to lose blood", "n. a person one likes and trusts", "n. a device that measures and shows time", 3, 2));
        tmp.add(new Question("In a game of singles, two players play ____ each other.", "against", "true", "play", "zone", 3, 2));
        tmp.add(new Question("I'm not very fond ___ detective stories.", "of", "in", "so", "before", 3, 2));
        tmp.add(new Question("Margarine is different ___ butter.", "from", "an", "a", "the", 3, 2));
        tmp.add(new Question("His parents are very strict ___ him.", "with", "from", "about", "the", 3, 2));
        tmp.add(new Question("Many people take part ___ jogging every morning.", "in", "on", "at", "of", 3, 2));
        tmp.add(new Question("We'd like a walk instead ___ riding a bike.", "of", "for", "in", "out", 3, 2));
        tmp.add(new Question("Henry is very good ___ fixing things.", "at", "on", "in", "of", 3, 2));
        tmp.add(new Question("They study and listen to music ___ the same time.", "at", "ob", "to", "in", 3, 2));
        tmp.add(new Question("___ literature, we learn about books and write essays.", "in", "on", "at", "for", 3, 2));
        tmp.add(new Question("Will you be home ___ dinner tonight?", "for", "in", "at", "of", 3, 2));
        tmp.add(new Question("What was wrong with ________ ? He had a bad cold.", "he", "she", "his", "him", 3, 2));
        tmp.add(new Question("This is my father. _______ is a farmer.", "he", "she", "his", "him", 3, 2));
        tmp.add(new Question("This is Mr. Bob. _________ is a doctor .", "he", "she", "his", "him", 3, 2));
        tmp.add(new Question("This is my father________name is Harry.", "he", "she", "his", "him", 3, 2));
        tmp.add(new Question("John brushes _________ teeth.", "he", "she", "his", "him", 3, 2));
        tmp.add(new Question("He doesn't have ________ timetable.", "he", "she", "his", "him", 3, 2));
        tmp.add(new Question("Peter is doing_________ homework.", "he", "she", "his", "him", 3, 2));
        tmp.add(new Question("What's your father's name?______ name is Henry.", "he", "she", "his", "him", 3, 2));
        tmp.add(new Question("________ father is a doctor.", "he", "she", "his", "him", 3, 2));
        tmp.add(new Question("He is a doctor, __________ name is Peter.", "he", "she", "his", "him", 3, 2));


        //bo de 3
        tmp.add(new Question("What is the handle's color of this kettle?", R.drawable.a1, "It is a silver kettle.", "It is the black handle.", "It is used to boil water.", "It is useful.", 3, 3)); //hinh1
        tmp.add(new Question("How many pins can you see in this hilt of the knife?", R.drawable.a2, "It is a sharp knife.", "There is one knife in this picture.", "There are half of six pins.", "It is black hilt.", 3, 3)); //hinh2
        tmp.add(new Question("What is this used to do?", R.drawable.a3, "This lamp is used to light roads.", "It is used to put in bed room like a night-lamp.", "It is quite expensive.", "This lamp is often used to light in restroom.", 3, 3)); //hinh3
        tmp.add(new Question("What is in front of the maid in this picture?", R.drawable.a4, "Another room", "A chair", "A white sofa", "A window", 3, 3)); //hinh4
        tmp.add(new Question("What is the shape of this microwave oven?", R.drawable.a5, "Triangle", "Cuboid", "Cube", "Trapezium", 3, 3)); //hinh5
        tmp.add(new Question("Where does this animal often live?", R.drawable.a6, "It often lives in land where is always wet.", "It often lives in dry land like desert.", "It lives easily in water.", "It can live in anywhere as long as there is not water.", 3, 3)); //hinh6
        tmp.add(new Question("What is the pink thing behind the two lovely cats?", R.drawable.a7, "A bamboo", "A shrift", "A flower", "A dinosaur", 3, 3)); //hinh7
        tmp.add(new Question("Which direction is this chick looking?", R.drawable.a8, "The chick is standing.", "It is looking on your left hand side.", "It looks so beautiful.", "It is a chick.", 3, 3)); //hinh8
        tmp.add(new Question("What is the sex of this chicken?", R.drawable.a9, "It is a cock.", "It is a hen.", "It is a male chicken.", "It isn't a female chicken.", 3, 3)); //hinh9
        tmp.add(new Question("In which is this beautiful cock?", R.drawable.a10, "It is standing in a luxurious house.", "It is in a garden.", "It is bare in a pot.", "It is looking forward to seeing a hen.", 3, 3)); //hinh10
        tmp.add(new Question("Chase", "v. to come to the earth from the air", "ad. not military", "n. the center part of an atom or cell", "v. to run or go after someone or something", 3, 3));
        tmp.add(new Question("Rate", "n. speed; a measure of how quickly or how often something happens", "v. to free; to permit to go", "n. a center where people live, larger than a village but not as large as a city", "n. one sent to act for another; one who represents another", 3, 3));
        tmp.add(new Question("Agency", "n. a male with the same father or mother as another person", "ad. having no fear", "n. one who guides or flies an airplane or helicopter", "n. an organization that is part of a larger group", 3, 3));
        tmp.add(new Question("Same", "ad. as is normal or common; as is most often done, seen or heard", "n. a business organized for trade, industrial or other purposes", "ad. not different; not changed", "v. to take away or take off; to put an end to", 3, 3));
        tmp.add(new Question("Open", "v. to start", "n. something built to travel on water that carries people or goods", "n. the telling or writing of an event, either real or imagined", "n. a spending plan", 3, 3));
        tmp.add(new Question("Transportation", "n. power used to do work, usually with machines; the ability and willingness to be active", "v. to go from one place to another, usually for a long distance", "n. the act or business of moving goods or people", "v. to make a person or animal a prisoner; to seize or take by force", 3, 3));
        tmp.add(new Question("Condition", "n. this day", "n. something declared necessary to complete an agreement; a person's health", "v. to take part in; to become a part of", "n. a drink made from the plant of the same name", 3, 3));
        tmp.add(new Question("Hijack", "v. to move forces or weapons into positions for action", "n. a person who is a member of a country by birth or by law", "v. to seize or take control of a vehicle by force", "v. to fail to obey or honor; to break (an agreement)", 3, 3));
        tmp.add(new Question("Airplane", "n. a vehicle with wings that flies", "n. a fight; a battle, especially a long one", "n. something that shows what another thing looks like; an idea or representation of something as seen by the eye", "n. a fight between opposing armed forces", 3, 3));
        tmp.add(new Question("Bleed", "n. fighting between nations, or groups in a nation, using weapons", "v. to lose blood", "n. a person one likes and trusts", "n. a device that measures and shows time", 3, 3));
        tmp.add(new Question("In a game of singles, two players play ____ each other.", "against", "true", "play", "zone", 3, 3));
        tmp.add(new Question("I'm not very fond ___ detective stories.", "of", "in", "so", "before", 3, 3));
        tmp.add(new Question("Margarine is different ___ butter.", "from", "an", "a", "the", 3, 3));
        tmp.add(new Question("His parents are very strict ___ him.", "with", "from", "about", "the", 3, 3));
        tmp.add(new Question("Many people take part ___ jogging every morning.", "in", "on", "at", "of", 3, 3));
        tmp.add(new Question("We'd like a walk instead ___ riding a bike.", "of", "for", "in", "out", 3, 3));
        tmp.add(new Question("Henry is very good ___ fixing things.", "at", "on", "in", "of", 3, 3));
        tmp.add(new Question("They study and listen to music ___ the same time.", "at", "ob", "to", "in", 3, 3));
        tmp.add(new Question("___ literature, we learn about books and write essays.", "in", "on", "at", "for", 3, 3));
        tmp.add(new Question("Will you be home ___ dinner tonight?", "for", "in", "at", "of", 3, 3));
        tmp.add(new Question("What was wrong with ________ ? He had a bad cold.", "he", "she", "his", "him", 3, 3));
        tmp.add(new Question("This is my father. _______ is a farmer.", "he", "she", "his", "him", 3, 3));
        tmp.add(new Question("This is Mr. Bob. _________ is a doctor .", "he", "she", "his", "him", 3, 3));
        tmp.add(new Question("This is my father________name is Harry.", "he", "she", "his", "him", 3, 3));
        tmp.add(new Question("John brushes _________ teeth.", "he", "she", "his", "him", 3, 3));
        tmp.add(new Question("He doesn't have ________ timetable.", "he", "she", "his", "him", 3, 3));
        tmp.add(new Question("Peter is doing_________ homework.", "he", "she", "his", "him", 3, 3));
        tmp.add(new Question("What's your father's name?______ name is Henry.", "he", "she", "his", "him", 3, 3));
        tmp.add(new Question("________ father is a doctor.", "he", "she", "his", "him", 3, 3));
        tmp.add(new Question("He is a doctor, __________ name is Peter.", "he", "she", "his", "him", 3, 3));


        //bo de 4
        tmp.add(new Question("What is the handle's color of this kettle?", R.drawable.a1, "It is a silver kettle.", "It is the black handle.", "It is used to boil water.", "It is useful.", 4, 4)); //hinh1
        tmp.add(new Question("How many pins can you see in this hilt of the knife?", R.drawable.a2, "It is a sharp knife.", "There is one knife in this picture.", "There are half of six pins.", "It is black hilt.", 4, 4)); //hinh2
        tmp.add(new Question("What is this used to do?", R.drawable.a3, "This lamp is used to light roads.", "It is used to put in bed room like a night-lamp.", "It is quite expensive.", "This lamp is often used to light in restroom.", 4, 4)); //hinh3
        tmp.add(new Question("What is in front of the maid in this picture?", R.drawable.a4, "Another room", "A chair", "A white sofa", "A window", 4, 4)); //hinh4
        tmp.add(new Question("What is the shape of this microwave oven?", R.drawable.a5, "Triangle", "Cuboid", "Cube", "Trapezium", 4, 4)); //hinh5
        tmp.add(new Question("Where does this animal often live?", R.drawable.a6, "It often lives in land where is always wet.", "It often lives in dry land like desert.", "It lives easily in water.", "It can live in anywhere as long as there is not water.", 4, 4)); //hinh6
        tmp.add(new Question("What is the pink thing behind the two lovely cats?", R.drawable.a7, "A bamboo", "A shrift", "A flower", "A dinosaur", 4, 4)); //hinh7
        tmp.add(new Question("Which direction is this chick looking?", R.drawable.a8, "The chick is standing.", "It is looking on your left hand side.", "It looks so beautiful.", "It is a chick.", 4, 4)); //hinh8
        tmp.add(new Question("What is the sex of this chicken?", R.drawable.a9, "It is a cock.", "It is a hen.", "It is a male chicken.", "It isn't a female chicken.", 4, 4)); //hinh9
        tmp.add(new Question("In which is this beautiful cock?", R.drawable.a10, "It is standing in a luxurious house.", "It is in a garden.", "It is bare in a pot.", "It is looking forward to seeing a hen.", 4, 4)); //hinh10
        tmp.add(new Question("Chase", "v. to come to the earth from the air", "ad. not military", "n. the center part of an atom or cell", "v. to run or go after someone or something", 4, 4));
        tmp.add(new Question("Rate", "n. speed; a measure of how quickly or how often something happens", "v. to free; to permit to go", "n. a center where people live, larger than a village but not as large as a city", "n. one sent to act for another; one who represents another", 4, 4));
        tmp.add(new Question("Agency", "n. a male with the same father or mother as another person", "ad. having no fear", "n. one who guides or flies an airplane or helicopter", "n. an organization that is part of a larger group", 4, 4));
        tmp.add(new Question("Same", "ad. as is normal or common; as is most often done, seen or heard", "n. a business organized for trade, industrial or other purposes", "ad. not different; not changed", "v. to take away or take off; to put an end to", 4, 4));
        tmp.add(new Question("Open", "v. to start", "n. something built to travel on water that carries people or goods", "n. the telling or writing of an event, either real or imagined", "n. a spending plan", 4, 4));
        tmp.add(new Question("Transportation", "n. power used to do work, usually with machines; the ability and willingness to be active", "v. to go from one place to another, usually for a long distance", "n. the act or business of moving goods or people", "v. to make a person or animal a prisoner; to seize or take by force", 4, 4));
        tmp.add(new Question("Condition", "n. this day", "n. something declared necessary to complete an agreement; a person's health", "v. to take part in; to become a part of", "n. a drink made from the plant of the same name", 4, 4));
        tmp.add(new Question("Hijack", "v. to move forces or weapons into positions for action", "n. a person who is a member of a country by birth or by law", "v. to seize or take control of a vehicle by force", "v. to fail to obey or honor; to break (an agreement)", 4, 4));
        tmp.add(new Question("Airplane", "n. a vehicle with wings that flies", "n. a fight; a battle, especially a long one", "n. something that shows what another thing looks like; an idea or representation of something as seen by the eye", "n. a fight between opposing armed forces", 4, 4));
        tmp.add(new Question("Bleed", "n. fighting between nations, or groups in a nation, using weapons", "v. to lose blood", "n. a person one likes and trusts", "n. a device that measures and shows time", 4, 4));
        tmp.add(new Question("In a game of singles, two players play ____ each other.", "against", "true", "play", "zone", 4, 4));
        tmp.add(new Question("I'm not very fond ___ detective stories.", "of", "in", "so", "before", 4, 4));
        tmp.add(new Question("Margarine is different ___ butter.", "from", "an", "a", "the", 4, 4));
        tmp.add(new Question("His parents are very strict ___ him.", "with", "from", "about", "the", 4, 4));
        tmp.add(new Question("Many people take part ___ jogging every morning.", "in", "on", "at", "of", 4, 4));
        tmp.add(new Question("We'd like a walk instead ___ riding a bike.", "of", "for", "in", "out", 4, 4));
        tmp.add(new Question("Henry is very good ___ fixing things.", "at", "on", "in", "of", 4, 4));
        tmp.add(new Question("They study and listen to music ___ the same time.", "at", "ob", "to", "in", 4, 4));
        tmp.add(new Question("___ literature, we learn about books and write essays.", "in", "on", "at", "for", 4, 4));
        tmp.add(new Question("Will you be home ___ dinner tonight?", "for", "in", "at", "of", 4, 4));
        tmp.add(new Question("What was wrong with ________ ? He had a bad cold.", "he", "she", "his", "him", 4, 4));
        tmp.add(new Question("This is my father. _______ is a farmer.", "he", "she", "his", "him", 4, 4));
        tmp.add(new Question("This is Mr. Bob. _________ is a doctor .", "he", "she", "his", "him", 4, 4));
        tmp.add(new Question("This is my father________name is Harry.", "he", "she", "his", "him", 4, 4));
        tmp.add(new Question("John brushes _________ teeth.", "he", "she", "his", "him", 4, 4));
        tmp.add(new Question("He doesn't have ________ timetable.", "he", "she", "his", "him", 4, 4));
        tmp.add(new Question("Peter is doing_________ homework.", "he", "she", "his", "him", 4, 4));
        tmp.add(new Question("What's your father's name?______ name is Henry.", "he", "she", "his", "him", 4, 4));
        tmp.add(new Question("________ father is a doctor.", "he", "she", "his", "him", 4, 4));
        tmp.add(new Question("He is a doctor, __________ name is Peter.", "he", "she", "his", "him", 4, 4));



        //bo de 5
        tmp.add(new Question("What is the handle's color of this kettle?", R.drawable.a1, "It is a silver kettle.", "It is the black handle.", "It is used to boil water.", "It is useful.", 3, 5)); //hinh1
        tmp.add(new Question("How many pins can you see in this hilt of the knife?", R.drawable.a2, "It is a sharp knife.", "There is one knife in this picture.", "There are half of six pins.", "It is black hilt.", 3, 5)); //hinh2
        tmp.add(new Question("Agency", "n. a male with the same father or mother as another person", "ad. having no fear", "n. one who guides or flies an airplane or helicopter", "n. an organization that is part of a larger group", 3, 5));
        tmp.add(new Question("Same", "ad. as is normal or common; as is most often done, seen or heard", "n. a business organized for trade, industrial or other purposes", "ad. not different; not changed", "v. to take away or take off; to put an end to", 3, 5));
        tmp.add(new Question("His parents are very strict ___ him.", "with", "from", "about", "the", 3, 5));
        tmp.add(new Question("Many people take part ___ jogging every morning.", "in", "on", "at", "of", 3, 5));
        tmp.add(new Question("They study and listen to music ___ the same time.", "at", "ob", "to", "in", 3, 5));
        tmp.add(new Question("What's your father's name?______ name is Henry.", "he", "she", "his", "him", 3, 5));
        tmp.add(new Question("________ father is a doctor.", "he", "she", "his", "him", 3, 5));
        tmp.add(new Question("He is a doctor, __________ name is Peter.", "he", "she", "his", "him", 3, 5));


        return tmp;
    }
}