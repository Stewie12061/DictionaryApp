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
        tmp.add(new Toeic("agreement ", "H???p ?????ng"));
        tmp.add(new Toeic("assurance ", "?????m b???o"));
        tmp.add(new Toeic("cancellation ", "H???y b???"));
        tmp.add(new Toeic("determine ", "Quy???t ?????nh"));
        tmp.add(new Toeic("engage ", "Cam k???t"));
        tmp.add(new Toeic("establish ", "Thi???t l???p"));
        tmp.add(new Toeic("obligate ", "B???t bu???c"));
        tmp.add(new Toeic("party ", "Bu???i ti???c"));
        tmp.add(new Toeic("provision ", "D??? tr???"));
        tmp.add(new Toeic("resolve ", "Gi???i quy???t"));
        tmp.add(new Toeic("specific ", "?????c tr??ng"));
        tmp.add(new Toeic("attract ", "Thu h??t"));
        tmp.add(new Toeic("compare ", "So s??nh"));
        tmp.add(new Toeic("competition ", "C???nh tranh"));
        tmp.add(new Toeic("consume ", "Ti??u d??ng"));
        tmp.add(new Toeic("convince ", "Thuy???t ph???c"));
        tmp.add(new Toeic("currently ", "Hi???n nay"));
        tmp.add(new Toeic("fad ", "Nh???t th???i"));
        tmp.add(new Toeic("inspiration ", "C???m h???ng"));
        tmp.add(new Toeic("market ", "Ch???"));
        tmp.add(new Toeic("persuasion ", "Thuy???t ph???c"));
        tmp.add(new Toeic("productive ", "S???n xu???t"));
        tmp.add(new Toeic("satisfaction ", "Th???a m??n"));
        tmp.add(new Toeic("characteristic ", "?????c tr??ng"));
        tmp.add(new Toeic("consequence ", "K???t qu???"));
        tmp.add(new Toeic("consider ", "C???n th???n"));
        tmp.add(new Toeic("cover ", "B???o v???"));
        tmp.add(new Toeic("expiration ", "K???t th??c"));
        tmp.add(new Toeic("frequently ", "Th?????ng xuy??n"));
        tmp.add(new Toeic("imply ", "???n ??"));
        tmp.add(new Toeic("promise ", "H???a"));
        tmp.add(new Toeic("protect ", "B???o v???"));
        tmp.add(new Toeic("reputation ", "B??c l???t"));
        tmp.add(new Toeic("require ", "Y??u c???u"));
        tmp.add(new Toeic("variety ", "??a d???ng"));
        tmp.add(new Toeic("address ", "?????a ch???"));
        tmp.add(new Toeic("avoid ", "Tr??nh"));
        tmp.add(new Toeic("demonstrate ", "Ch???ng minh"));
        tmp.add(new Toeic("develop ", "Ph??t tri???n"));
        tmp.add(new Toeic("evaluate ", "????nh gi??"));
        tmp.add(new Toeic("gather ", "T???p h???p"));
        tmp.add(new Toeic("offer ", "????? xu???t"));
        tmp.add(new Toeic("primarily", "Ch??? y???u"));
        tmp.add(new Toeic("risk ", "Nguy c??"));
        tmp.add(new Toeic("strategy ", "Chi???n l?????c"));
        tmp.add(new Toeic("strong ", "M???nh m???"));
        tmp.add(new Toeic("substitution ", "Thay th???"));
        tmp.add(new Toeic("accommodate ", "??i???u ch???nh"));
        tmp.add(new Toeic("arrangement ", "Thu x???p"));
        tmp.add(new Toeic("association ", "??o??n th???"));
        tmp.add(new Toeic("attend ", "Tham d???"));
        tmp.add(new Toeic("hold ", "Gi???"));
        tmp.add(new Toeic("location", "T???a ?????"));
        tmp.add(new Toeic("overcrowded", "Ch???t n??ch"));
        tmp.add(new Toeic("register ", "????ng k??"));
        tmp.add(new Toeic("select ", "Ch???n"));
        tmp.add(new Toeic("session ", "K???"));
        return tmp;
    }
    public static ArrayList<Toefl> initToefl() {
        ArrayList<Toefl> tmp = new ArrayList<>();
        tmp.add(new Toefl("promise ", "H???a"));
        tmp.add(new Toefl("protect ", "B???o v???"));
        tmp.add(new Toefl("reputation ", "B??c l???t"));
        tmp.add(new Toefl("require ", "Y??u c???u"));
        tmp.add(new Toefl("variety ", "??a d???ng"));
        tmp.add(new Toefl("address ", "?????a ch???"));
        tmp.add(new Toefl("avoid ", "Tr??nh"));
        tmp.add(new Toefl("demonstrate ", "Ch???ng minh"));
        tmp.add(new Toefl("develop ", "Ph??t tri???n"));
        tmp.add(new Toefl("evaluate ", "????nh gi??"));
        tmp.add(new Toefl("gather ", "T???p h???p"));
        tmp.add(new Toefl("offer ", "????? xu???t"));
        tmp.add(new Toefl("primarily", "Ch??? y???u"));
        tmp.add(new Toefl("risk ", "Nguy c??"));
        tmp.add(new Toefl("strategy ", "Chi???n l?????c"));
        tmp.add(new Toefl("strong ", "M???nh m???"));
        tmp.add(new Toefl("substitution ", "Thay th???"));
        tmp.add(new Toefl("accommodate ", "??i???u ch???nh"));
        tmp.add(new Toefl("arrangement ", "Thu x???p"));
        tmp.add(new Toefl("association ", "??o??n th???"));
        tmp.add(new Toefl("attend ", "Tham d???"));
        tmp.add(new Toefl("hold ", "Gi???"));
        tmp.add(new Toefl("location", "T???a ?????"));
        tmp.add(new Toefl("overcrowded", "Ch???t n??ch"));
        tmp.add(new Toefl("register ", "????ng k??"));
        tmp.add(new Toefl("select ", "Ch???n"));
        tmp.add(new Toefl("session ", "K???"));
        tmp.add(new Toefl("agreement ", "H???p ?????ng"));
        tmp.add(new Toefl("assurance ", "?????m b???o"));
        tmp.add(new Toefl("cancellation ", "H???y b???"));
        tmp.add(new Toefl("determine ", "Quy???t ?????nh"));
        tmp.add(new Toefl("engage ", "Cam k???t"));
        tmp.add(new Toefl("establish ", "Thi???t l???p"));
        tmp.add(new Toefl("obligate ", "B???t bu???c"));
        tmp.add(new Toefl("party ", "Bu???i ti???c"));

        return tmp;
    }
    public static ArrayList<Ielts> initIelts() {
        ArrayList<Ielts> tmp = new ArrayList<>();
        tmp.add(new Ielts("currently ", "Hi???n nay"));
        tmp.add(new Ielts("fad ", "Nh???t th???i"));
        tmp.add(new Ielts("inspiration ", "C???m h???ng"));
        tmp.add(new Ielts("market ", "Ch???"));
        tmp.add(new Ielts("persuasion ", "Thuy???t ph???c"));
        tmp.add(new Ielts("productive ", "S???n xu???t"));
        tmp.add(new Ielts("satisfaction ", "Th???a m??n"));
        tmp.add(new Ielts("characteristic ", "?????c tr??ng"));
        tmp.add(new Ielts("consequence ", "K???t qu???"));
        tmp.add(new Ielts("consider ", "C???n th???n"));
        tmp.add(new Ielts("cover ", "B???o v???"));
        tmp.add(new Ielts("expiration ", "K???t th??c"));
        tmp.add(new Ielts("frequently ", "Th?????ng xuy??n"));
        tmp.add(new Ielts("imply ", "???n ??"));
        tmp.add(new Ielts("promise ", "H???a"));
        tmp.add(new Ielts("protect ", "B???o v???"));
        tmp.add(new Ielts("reputation ", "B??c l???t"));
        tmp.add(new Ielts("require ", "Y??u c???u"));
        tmp.add(new Ielts("variety ", "??a d???ng"));
        tmp.add(new Ielts("address ", "?????a ch???"));
        tmp.add(new Ielts("agreement ", "H???p ?????ng"));
        tmp.add(new Ielts("assurance ", "?????m b???o"));
        tmp.add(new Ielts("cancellation ", "H???y b???"));
        tmp.add(new Ielts("determine ", "Quy???t ?????nh"));
        tmp.add(new Ielts("engage ", "Cam k???t"));
        tmp.add(new Ielts("establish ", "Thi???t l???p"));
        tmp.add(new Ielts("obligate ", "B???t bu???c"));
        tmp.add(new Ielts("party ", "Bu???i ti???c"));
        tmp.add(new Ielts("provision ", "D??? tr???"));
        tmp.add(new Ielts("resolve ", "Gi???i quy???t"));
        tmp.add(new Ielts("specific ", "?????c tr??ng"));
        tmp.add(new Ielts("attract ", "Thu h??t"));
        tmp.add(new Ielts("compare ", "So s??nh"));
        return tmp;
    }

// tra tu dien , search
    public static ArrayList<Tudien> init() {
        ArrayList<Tudien> tmp = new ArrayList<>();
        tmp.add(new Tudien("Multiplication", "Ph??p nh??n", 1));
        tmp.add(new Tudien("Numeric", "S??? h???c", 2));
        tmp.add(new Tudien("Operation", "Thao t??c", 3));
        tmp.add(new Tudien("Output", "Ra, ????a ra", 4));
        tmp.add(new Tudien("Perform", "Ti???n h??nh, thi h??nh", 5));
        tmp.add(new Tudien("Process", "X??? l??", 6));
        tmp.add(new Tudien("Processor", "B??? x??? l??", 7));
        tmp.add(new Tudien("Pulse", "Xung", 8));
        tmp.add(new Tudien("Register", "Thanh ghi, ????ng k??", 9));
        tmp.add(new Tudien("Signal", "T??n hi???u", 10));
        tmp.add(new Tudien("Solution", "Gi???i ph??p, l???i gi???i", 11));
        tmp.add(new Tudien("Store", "L??u tr???", 12));
        tmp.add(new Tudien("Subtraction", "Ph??p tr???", 13));
        tmp.add(new Tudien("Switch", "Chuy???n", 14));
        tmp.add(new Tudien("Tape", "Ghi b??ng, b??ng", 15));
        tmp.add(new Tudien("Terminal", "M??y tr???m", 16));
        tmp.add(new Tudien("Transmit", "Truy???n", 17));
        tmp.add(new Tudien("Abacus", "B??n t??nh", 18));
        tmp.add(new Tudien("Allocate", "Ph??n ph???i", 19));
        tmp.add(new Tudien("Analog", "T????ng t???", 20));
        tmp.add(new Tudien("Application", "???ng d???ng", 21));
        tmp.add(new Tudien("Binary", "Nh??? ph??n, thu???c v??? nh??? ph??n", 22));
        tmp.add(new Tudien("Calculation", "T??nh to??n", 23));
        tmp.add(new Tudien("Command", "Ra l???nh, l???nh (trong m??y t??nh)", 24));
        tmp.add(new Tudien("Dependable", "C?? th??? tin c???y ???????c", 25));
        tmp.add(new Tudien("Devise", "Ph??t minh", 26));
        tmp.add(new Tudien("Different", "Kh??c bi???t", 27));
        tmp.add(new Tudien("Digital", "S???, thu???c v??? s???", 28));
        tmp.add(new Tudien("Etch", "Kh???c axit", 29));
        tmp.add(new Tudien("Experiment", "Ti???n h??nh th?? nghi???m, cu???c th?? nghi???m", 30));
        tmp.add(new Tudien("Remote Access", "Truy c???p t??? xa qua m???ng", 31));
        tmp.add(new Tudien("Computerize", "Tin h???c h??a", 32));
        tmp.add(new Tudien("Storage", "L??u tr???", 33));
        tmp.add(new Tudien("Figure out", "T??nh to??n, t??m ra", 34));
        tmp.add(new Tudien("Generation", "Th??? h???", 35));
        tmp.add(new Tudien("History", "L???ch s???", 36));
        tmp.add(new Tudien("Imprint", "In, kh???c", 37));
        tmp.add(new Tudien("Integrate", "T??ch h???p", 38));
        tmp.add(new Tudien("Invention", "Ph??t minh", 39));
        tmp.add(new Tudien("Layer", "T???ng, l???p", 40));
        tmp.add(new Tudien("Mainframe computer", "M??y t??nh l???n", 41));
        tmp.add(new Tudien("Ability", "Kh??? n??ng", 42));
        tmp.add(new Tudien("Access", "Truy c???p", 43));
        tmp.add(new Tudien("Acoustic coupler", "B??? gh??p ??m", 44));
        tmp.add(new Tudien("Analyst", "Nh?? ph??n t??ch", 45));
        tmp.add(new Tudien("Centerpiece", "M???nh trung t??m", 46));
        tmp.add(new Tudien("Channel", "K??nh", 47));
        tmp.add(new Tudien("Characteristic", "Thu???c t??nh", 48));
        tmp.add(new Tudien("Cluster controller", "B??? ??i???u khi???n tr??m", 49));
        tmp.add(new Tudien("Consist", "Bao g???m", 50));
        tmp.add(new Tudien("Convert", "Chuy???n ?????i", 51));
        tmp.add(new Tudien("Equipment", "Trang thi???t b???", 52));
        tmp.add(new Tudien("Multiplexor", "B??? d???n k??nh", 53));
        tmp.add(new Tudien("Network", "M???ng", 54));
        tmp.add(new Tudien("Peripheral", "Ngo???i vi", 55));
        tmp.add(new Tudien("Reliability", "S??? c?? th??? tin c???y ???????c", 56));
        tmp.add(new Tudien("Single-purpose", "????n m???c ????ch", 57));
        tmp.add(new Tudien("Teleconference", "H???i th???o t??? xa", 58));
        tmp.add(new Tudien("Arithmetic", "S??? h???c", 59));
        return tmp;
    }
    public static ArrayList<Tudiens> initTudiens() {
        ArrayList<Tudiens> tmp = new ArrayList<>();
        tmp.add(new Tudiens("Multiplication", "DANH TU", "S??? nh??n", "ph??p nh??n", 1));
        tmp.add(new Tudiens("Numeric", "TINHTU", "S??? h???c", "Thu???c v??? s??? h???c", 2));
        tmp.add(new Tudiens("Operation", "DANHTU", "S??? ho???t ?????ng, qu?? tr??nh ho???t ?????ng", "Hi???u qu???, t??c d???ng", 3));
        tmp.add(new Tudiens("Output", "DANHTU", "Ra", "????a ra", 4));
        tmp.add(new Tudiens("Perform", "DONGTU", "Ti???n h??nh", "Thi h??nh", 5));
        tmp.add(new Tudiens("Process", "DONGTU", "X??? l??", "Quy tr??nh", 6));
        tmp.add(new Tudiens("Processor", "DANHTU", "B??? x??? l??", "M??y ch??? bi???n", 7));
        tmp.add(new Tudiens("Pulse", "DANHTU", "Xung", "Nh???p ?????p, m???ch", 8));
        tmp.add(new Tudiens("Register", "DANHTU", "Thanh ghi", "????ng k??", 9));
        tmp.add(new Tudiens("Signal", "DANHTU", "T??n hi???u", "Hi???u l???nh", 10));
        tmp.add(new Tudiens("Solution", "DANHTU", "Gi???i ph??p", "s??? h??a tan", 11));
        tmp.add(new Tudiens("Store", "DANHTU", "L??u tr???", "C???a h??ng", 12));
        tmp.add(new Tudiens("Subtraction", "DANHTU", "S??? tr???", "Ph??p tr???", 13));
        tmp.add(new Tudiens("Switch", "DONGTU", "Chuy???n", "c??ng t???t ????n", 14));
        tmp.add(new Tudiens("Tape", "DANHTU", "D??y, d???i", "B??ng", 15));
        tmp.add(new Tudiens("Terminal", "DANHTU", "M??y tr???m", "Ph???n cu???i", 16));
        tmp.add(new Tudiens("Transmit", "DONGTU", "Truy???n", "Ph??t", 17));
        tmp.add(new Tudiens("Abacus", "DANHTU", "B??n t??nh", "?????nh c???t", 18));
        tmp.add(new Tudiens("Allocate", "DONGTU", "Ph??n ph???i", "Ch??? ?????nh", 19));
        tmp.add(new Tudiens("Analog", "DONGTU", "T????ng t???", "T????ng t???", 20));
        tmp.add(new Tudiens("Application", "DANHTU", "s??? g???n v??o", "l???i th???nh c???u", 21));
        tmp.add(new Tudiens("Binary", "TINHTU", "Nh??? ph??n", "????i", 22));
        tmp.add(new Tudiens("Calculation", "DANHTU", "S??? c??n nh???c", "S??? t??nh to??n", 23));
        tmp.add(new Tudiens("Command", "DANHTU", "L???nh", "S??? l??m ch???", 24));
        tmp.add(new Tudiens("Dependable", "TINHTU", "C?? th??? tin ???????c", "????ng tin c???y", 25));
        tmp.add(new Tudiens("Devise", "DANHTU", "S??? ????? l???i", "Di s???n", 26));
        tmp.add(new Tudiens("Different", "TINHTU", "T??ch ra", "Kh??c r?? r???t", 27));
        tmp.add(new Tudiens("Digital", "DANHTU", "S???", "Ph??m", 28));
        tmp.add(new Tudiens("Etch", "DONGTU", "Kh???c axit", "Kh???c", 29));
        tmp.add(new Tudiens("Experiment", "DANHTU", "Cu???c th?? nghi???m", "Cu???c th??? nghi???m", 30));
        tmp.add(new Tudiens("Remote Access", "DANHTU", "Truy c???p t??? xa qua m???ng", "Truy c???p t??? xa qua m???ng", 31));
        tmp.add(new Tudiens("Computerize", "DONGTU", "Tin h???c h??a", "Tin h???c h??a", 32));
        tmp.add(new Tudiens("Storage", "DANHTU", "S??? c???t gi???", "L??u tr???", 33));
        tmp.add(new Tudiens("Figure out", "DANHTU", "T??nh to??n", "T??m ra", 34));
        tmp.add(new Tudiens("Generation", "DANHTU", "S??? sinh ra", "Th??? h???", 35));
        tmp.add(new Tudiens("History", "DANHTU", "L???ch s???", "M??n l???ch s???", 36));
        tmp.add(new Tudiens("Imprint", "DANHTU", "In", "Kh???c", 37));
        tmp.add(new Tudiens("Integrate", "DONGTU", "T??ch h???p", "H??a nh???p", 38));
        tmp.add(new Tudiens("Invention", "DANHTU", "S??? ph??t minh", "S??? s??ng ch???", 39));
        tmp.add(new Tudiens("Layer", "DANHTU", "T???ng", "L???p", 40));
        tmp.add(new Tudiens("Mainframe computer", "DANHTU", "M??y t??nh l???n", "M??y t??nh ch??nh", 41));
        tmp.add(new Tudiens("Ability", "DANHTU", "S??? kh??o l??o", "T??i n??ng", 42));
        tmp.add(new Tudiens("Access", "DANHTU", "Truy c???p", "S??? truy c???p", 43));
        tmp.add(new Tudiens("Acoustic coupler", "TINHTU", "B??? gh??p ??m", "Gh??p ??m thanh", 44));
        tmp.add(new Tudiens("Analyst", "DANHTU", "Nh?? ph??n t??ch", "Ng?????i ph??n t??ch", 45));
        tmp.add(new Tudiens("Centerpiece", "DANHTU", "M???nh trung t??m", "Trung t??m", 46));
        tmp.add(new Tudiens("Channel", "DANHTU", "K??nh", "L??ng s??ng", 47));
        tmp.add(new Tudiens("Characteristic", "DANHTU", "N??t ?????c tr??ng", "?????c ??i???m", 48));
        tmp.add(new Tudiens("Cluster controller", "DANHTU", "B??? ??i???u khi???n tr??m", "B??? ??i???u khi???n tr??m", 49));
        tmp.add(new Tudiens("Consist", "DONHTU", "Bao g???m", "Ph?? h???p", 50));
        tmp.add(new Tudiens("Convert", "DONGTU", "Chuy???n", "Bi???n ?????i", 51));
        tmp.add(new Tudiens("Equipment", "DANHTU", "Trang thi???t b???", "S??? trang b???", 52));
        tmp.add(new Tudiens("Multiplexor", "TINHTU", "B??? d???n k??nh", "Nhi???u k??nh", 53));
        tmp.add(new Tudiens("Network", "DANHTU", "M???ng", "M???ng l?????i", 54));
        tmp.add(new Tudiens("Peripheral", "TINHTU", "Ngo???i vi", "Chu vi", 55));
        tmp.add(new Tudiens("Reliability", "DANHTU", "S??? ????ng tin c???y", "T??nh ????ng tin c???y", 56));
        tmp.add(new Tudiens("Single-purpose", "TINHTU", "????n m???c ????ch", "Chuy??n d??ng", 57));
        tmp.add(new Tudiens("Teleconference", "DANHTU", "H???i th???o t??? xa", "C??c cu???c h???p ???????c t??? ch???c qua ??i???n tho???i", 58));
        tmp.add(new Tudiens("Arithmetic", "DANHTU", "S??? h???c", "S??? t??nh", 59));
        return tmp;
    }
    // vocab 1
    public static ArrayList<Vocab> initV() {
        ArrayList<Vocab> tmp = new ArrayList<>();
        tmp.add(new Vocab("TOPIC 1: RAU C??? QU???", "Celery - C???n t??y", "Cabbage - B???p c???i", 1));
        tmp.add(new Vocab("TOPIC 2: ?????NG V???T", "Dog - Con ch??", "Cat - Con m??o", 2));
        tmp.add(new Vocab("TOPIC 3: C??NG NGH???", "Abacus - B??n t??nh", "Appliance - Thi???t b???, m??y m??c", 3));
        tmp.add(new Vocab("TOPIC 4: NGH??? NGHI???P", "Programme - L???p tr??nh vi??n", "Software developer - Nh??n vi??n ph??t tri???n ph???n m???m", 4));
        tmp.add(new Vocab("TOPIC 5: C?? TH??? NG?????I", "Face - M???t", "Neck - C???", 5));
        tmp.add(new Vocab("TOPIC 6: GIA ????NH", "Parents - Ba m???", "Stepparent - Cha m??? k???", 6));
        tmp.add(new Vocab("TOPIC 7: TH??? THAO", "Football - M??n b??ng ????", "Volleyball - M??n b??ng chuy???n", 7));
        tmp.add(new Vocab("TOPIC 8: NH?? B???P", "Apron - Apron", "Breadbasket - Breadbasket", 8));
        tmp.add(new Vocab("TOPIC 9: TH???I GIAN", "Monday - Th??? hai", "Tuesday - Th??? ba", 9));
        tmp.add(new Vocab("TOPIC 10: ???M TH???C T???T", "Boiled chicken - G?? lu???c", "Cashew nut - H???t ??i???u", 10));

        return tmp;
    }
//

    //vocab 2
    public static ArrayList<Vocabulary> initVocabulary() {
        ArrayList<Vocabulary> tmp = new ArrayList<>();
        tmp.add(new Vocabulary("TOPIC 1: RAU C??? QU???", "Celery - C???n t??y", "Cabbage - B???p c???i", "Cauliflower - S??p l??", "Corn - Ng??", "Marrow - Qu??? b?? xanh", "Tomato - Qu??? c?? chua", "Radish - C??? c???i", "Eggplant - C?? t??m", "Seaweed - Rong bi???n", 1));
        tmp.add(new Vocabulary("TOPIC 2: ?????NG V???T", "Dog - Con ch??", "Cat - Con m??o", "Camel - Con l???c ????", "White mouse - Con chu???t b???ch", "Dove - B??? c??u", "Duck - Con v???t", "Lion - Con s?? t???", "Bear - Con g???u", "Elephant - Elephant", 2));
        tmp.add(new Vocabulary("TOPIC 3: C??NG NGH???", "Abacus - B??n t??nh", "Appliance - Thi???t b???, m??y m??c", "Circuit - M???ch", "Disk - ????a", "Memory - B??? nh???", "Software - Ph???n m???m", "Equipment - Thi???t b???", "Keyboard - B??n ph??m", "Screen - M??n h??nh", 3));
        tmp.add(new Vocabulary("TOPIC 4: NGH??? NGHI???P", "Programme - L???p tr??nh vi??n", "Software developer - Nh??n vi??n ph??t tri???n ph???n m???m", "Web develope - Nh??n vi??n ph??t tri???n m???ng", "Database administrator - Nh??n vi??n qu???n l?? d??? li???u", "Web designer  - Web designer", "Computer software engineer - K?? s?? ph???n m???m m??y t??nh", "Doctor - B??c s??", "Baker - Th??? l??m b??nh", "Tailor - Th??? may", 4));
        tmp.add(new Vocabulary("TOPIC 5: C?? TH??? NG?????I", "Face - M???t", "Neck - C???", "Mouth - Mi???ng", "Arm - Tay", "Leg - ????i ch??n", "Heart - Tim", "Stomach - D??? d??y", "Vein - T??nh m???ch", "Artery - ?????ng m???ch", 5));
        tmp.add(new Vocabulary("TOPIC 6: GIA ????NH", "Parents - Ba m???", "Stepparent - Cha m??? k???", "Mother - M???", "Father - B???", "Sibling - Anh ch??? em ru???t", "Spouse - V??? ch???ng", "Husband - Ch???ng", "Wife - V???", "Daughter - Con g??i", 6));
        tmp.add(new Vocabulary("TOPIC 7: TH??? THAO", "Football - M??n b??ng ????", "Volleyball - M??n b??ng chuy???n", "Basketball - B??ng r???", "Baseball - B??ng ch??y", "Badminton - C???u l??ng", "Fishing - C??u c??", "Eurythmics - Th??? d???c nh???p ??i???u", "Weightlifting - C??? t???", "Skateboarding - Tr?????t v??n", 7));
        tmp.add(new Vocabulary("TOPIC 8: NH?? B???P", "Apron - Apron", "Breadbasket - Breadbasket", "Bowl - B??t", "Teapot - Teapot", "Spice container - H???p gia v???", "Corkscrew - ????? m??? n???p chai", "Frying pan - Ch???o chi??n", "Cooker - N???i c??m ??i???n", "Chopsticks - ????a", 8));
        tmp.add(new Vocabulary("TOPIC 9: TH???I GIAN", "Monday - Th??? hai", "Tuesday - Th??? ba", "Wednesday - Th??? t??", "Thursday - Th??? n??m", "Friday - Th??? s??u", "Saturday - Th??? b???y", "Sunday - Ch??? nh???t", "Every day or daily - H??ng ng??y", "Every week or weekly - H??ng tu???n", 9));
        tmp.add(new Vocabulary("TOPIC 10: ???M TH???C T???T", "Boiled chicken - G?? lu???c", "Cashew nut - H???t ??i???u", "Pickled onion - D??a h??nh", "Five fruit tray - Gi?? l???a", "Five fruit tray - M??m ng?? qu???", "Jellied meat - Th???t ????ng", "Steamed sticky rice - X??i", "Spring roll - Nem r??n", "Dried bamboo shoots soup - Canh m??ng kh??", 10));
        return tmp;
    }
//senten 1
    public static ArrayList<Sentences> initS() {
        ArrayList<Sentences> tmp = new ArrayList<>();
        tmp.add(new Sentences("TOPIC 1 :Giao ti???p Ch??o h???i", "Hello ??? Xin ch??o", "Are you Canadian? ??? B???n l?? ng?????i Canada ph???i kh??ng?", 1));
        tmp.add(new Sentences("TOPIC 2 :Giao ti???p Gia ????nh", "Do you have any brothers or sisters? ??? B???n c?? anh ch??? em kh??ng?", "Have you got any kids? ??? B???n c?? con kh??ng?", 2));
        tmp.add(new Sentences("TOPIC 3 :Giao ti???p Tr?????ng h???c", "This is my classmate ??? ????y l?? b???n h???c c???a t??i", "It???s time your break now ??? ?????n gi??? gi???i lao r???i", 3));
        tmp.add(new Sentences("TOPIC 4 :Giao ti???p Nh?? h??ng", "We haven???t booked a table yet, can you fit us? ??? Ch??ng t??i ch??a ?????t b??n? L??m ??n x???p ch??? cho ch??ng t??i", "I booked a table for two at 7pm. It???s under the name of ??? ??? T??i ???? ?????t m???t b??n 2 ng?????i l??c 7 gi??? t???i, t??n t??i l?????", 4));
        tmp.add(new Sentences("TOPIC 5 :Giao ti???p Du l???ch", "Can we have an extra chair, please? ??? Cho t??i xin th??m m???t c??i gh??? n???a", "Are there any interesting attractions there? ??? ??? ???? c?? ?????a ??i???m du l???ch n??o th?? v??? kh??ng?", 5));
        tmp.add(new Sentences("TOPIC 6 :Giao ti???p Mua s???m", "Excuse me, can you help me please? ??? Xin l???i, b???n c?? th??? gi??p t??i kh??ng?", "I???m just looking ??? T??i ??ang xem m???t ch??t", 6));
        tmp.add(new Sentences("TOPIC 7 :Giao ti???p H???i ???????ng", "I???m just looking ??? T??i ??ang xem m???t ch??t", "Sorry, I don???t live around here ??? Xin l???i, t??i kh??ng s???ng ??? khu n??y", 7));
        return tmp;
    }
//senten2
    public static ArrayList<Senten> initSen() {
        ArrayList<Senten> tmp = new ArrayList<>();
        tmp.add(new Senten("TOPIC 1 :Giao ti???p Ch??o h???i", "Hello ??? Xin ch??o", "Are you Canadian? ??? B???n l?? ng?????i Canada ph???i kh??ng?", "Where are you coming from? ??? B???n ?????n t??? ????u?", "Glad to meet you ??? R???t vui ???????c g???p b???n", "I don???t understand English well ??? T??i kh??ng gi???i ti???ng Anh l???m", "Please speak more slowly ??? B???n c?? th??? n??i ch???m m???t ch??t kh??ng?", "Can you repeat? ??? B???n c?? th??? l???p l???i kh??ng?", "Can I help you? ??? T??i gi??p g?? ???????c cho b???n?", "How do you do? ??? D???o n??y th??? n??o?", 1));
        tmp.add(new Senten("TOPIC 2 :Giao ti???p Gia ????nh", "I???m an only child  ??? T??i l?? con m???t", "Do you have any brothers or sisters? ??? B???n c?? anh ch??? em kh??ng?", "I???ve got a baby ??? T??i m???i c?? m???t em b??", "Have you got any kids? ??? B???n c?? con kh??ng?", "Where do your parents live? ??? B??? m??? b???n s???ng ??? ????u?", "Are you married? ??? B???n c?? gia ????nh ch??a?", "How long have you been married? ??? B???n l???p gia ????nh bao l??u r???i?", "I???m divorced ??? T??i ???? ly h??n", "Could you tell me about your family? ??? B???n chia s??? m???t ch??t v??? gia ????nh m??nh v???i t??i ???????c kh??ng?", 2));
        tmp.add(new Senten("TOPIC 3 :Giao ti???p Tr?????ng h???c", "This is my classmate ??? ????y l?? b???n h???c c???a t??i", "It???s time your break now ??? ?????n gi??? gi???i lao r???i", "What???s your major? ??? B???n h???c ng??nh g?? v???y?", "I???m a second year student ??? T??i l?? sinh vi??n n??m 2", "Which university do you want to get in? ??? B???n mu???n thi tr?????ng ?????i h???c n??o?", "What subject do you like? B???n th??ch m??n g???", "Can I borrow your pencil? ??? Cho m??nh m?????n b??t ch?? ???????c kh??ng?", "Do you understand what the teacher said? ??? B???n c?? hi???u c?? gi??o n??i g?? kh??ng?", "I forgot my books for the math class ??? T??? qu??n kh??ng mang s??ch to??n r???i", 3));
        tmp.add(new Senten("TOPIC 4 :Giao ti???p Nh?? h??ng", "We haven???t booked a table yet, can you fit us? ??? Ch??ng t??i ch??a ?????t b??n? L??m ??n x???p ch??? cho ch??ng t??i", "I booked a table for two at 7pm. It???s under the name of ??? ??? T??i ???? ?????t m???t b??n 2 ng?????i l??c 7 gi??? t???i, t??n t??i l?????", "Can we have an extra chair, please? ??? Cho t??i xin th??m m???t c??i gh??? n???a", "Can we have a look at the menu? ??? Cho ch??ng t??i xem th???c ????n v???i", "What???s special for today? ??? H??m nay c?? m??n g?? ?????c bi???t?", "Can you bring me a spoon, please? ??? L???y gi??p m???t c??i th??a v???i", "Could you pass me the ketchup, please? ??? L???y gi??p t??i l??? t????ng c??", "Excuse me, but my meat is cold ??? Th???t c???a t??i b??? ngu???i r???i", "Can I pay by credit card? ??? T??i c?? th??? tr??? b???ng th??? t??n d???ng kh??ng?", 4));
        tmp.add(new Senten("TOPIC 5 :Giao ti???p Du l???ch", "Can we have an extra chair, please? ??? Cho t??i xin th??m m???t c??i gh??? n???a", "Are there any interesting attractions there? ??? ??? ???? c?? ?????a ??i???m du l???ch n??o th?? v??? kh??ng?", "How much is the fare? ??? Gi?? v?? bao nhi??u?", "How much is the guide fee per day? ??? Ti???n ph?? h?????ng d???n vi??n m???t ng??y l?? bao nhi??u?", "What???s special product here? ??? ??? ????y c?? ?????c s???n n???i ti???ng g???", "Is there any goods restaurants here? ??? ??? ????y c?? nh?? h??ng n??o ngon?", "I???d like to buy some souvenirs ??? T??i mu???n mua 1 s??? m??n ????? l??u ni???m", "We took a lot of pictures ??? Ch??ng t??i ???? ch???p r???t nhi???u ???nh", "What is the city famous for? -Th??nh ph??? ???? n???i ti???ng v??? c??i g???", 5));
        tmp.add(new Senten("TOPIC 6 :Giao ti???p Mua s???m", "Excuse me, can you help me please? ??? Xin l???i, b???n c?? th??? gi??p t??i kh??ng?", "I???m just looking ??? T??i ??ang xem m???t ch??t", "How much is this? ??? C??i n??y gi?? bao nhi??u?", "Can I have discount for this? ??? C??i n??y c?? ???????c gi???m gi?? kh??ng?", "What size is it? ??? C??i n??y c??? bao nhi??u?", "Do you have this in a size L ??? C??i n??y c?? size L kh??ng?", "Have you got that shirt in a smaller size? ???  C??i ??o ???? c?? c??? nh??? h??n kh??ng?", "Can I try this on? ??? T??i c?? th??? th??? c??i n??y kh??ng?", "I???ll take it ??? T??i l???y c??i n??y", 6));
        tmp.add(new Senten("TOPIC 7 :Giao ti???p H???i ???????ng", "I???m just looking ??? T??i ??ang xem m???t ch??t", "Sorry, I don???t live around here ??? Xin l???i, t??i kh??ng s???ng ??? khu n??y", "Are we on the right road for? ??? Ch??ng ta ??ang ??i ????ng ???????ng ???? ch????", "Excuse me, can you tell me where am I ??? Cho t??i h???i ????y l?? ????u?", "Please show me the way ??? L??m ??n gi??p ch??? ???????ng", "Where should I turn? ??? T??i ph???i r??? ??? ????u?", "What is this street? ??? ???????ng n??y l?? ???????ng g???", "Turn left at the crossroads ??? R??? tra??i ??? ng?? t??", "Straight ahead for about 100m ??? C??? ??i th???ng 100m n???a", 7));
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