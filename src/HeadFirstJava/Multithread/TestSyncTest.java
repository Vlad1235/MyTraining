package HeadFirstJava.Multithread;

public class TestSyncTest {
    public static void main(String[] args) {
        TestSync job = new TestSync();
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.start();
        b.start();
    }
} // обратить внимание, что 2 нет она после 19 и далее подобных много
/*
Баланс равен1
Баланс равен3
Баланс равен4
Баланс равен5
Баланс равен6
Баланс равен7
Баланс равен8
Баланс равен9
Баланс равен10
Баланс равен11
Баланс равен12
Баланс равен13
Баланс равен14
Баланс равен15
Баланс равен16
Баланс равен17
Баланс равен18
Баланс равен19
Баланс равен2
Баланс равен20
Баланс равен22
Баланс равен23
Баланс равен21
Баланс равен24
Баланс равен25
Баланс равен26
Баланс равен27
Баланс равен28
Баланс равен30
Баланс равен31
Баланс равен32
Баланс равен33
Баланс равен34
Баланс равен35
Баланс равен36
Баланс равен37
Баланс равен38
Баланс равен39
Баланс равен40
Баланс равен41
Баланс равен42
Баланс равен43
Баланс равен44
Баланс равен45
Баланс равен46
Баланс равен47
Баланс равен48
Баланс равен49
Баланс равен50
Баланс равен51
Баланс равен52
Баланс равен53
Баланс равен54
Баланс равен55
Баланс равен29
Баланс равен56
Баланс равен57
Баланс равен58
Баланс равен59
Баланс равен60
Баланс равен61
Баланс равен62
Баланс равен63
Баланс равен64
Баланс равен65
Баланс равен66
Баланс равен67
Баланс равен68
Баланс равен69
Баланс равен70
Баланс равен71
Баланс равен72
Баланс равен73
Баланс равен74
Баланс равен75
Баланс равен76
Баланс равен77
Баланс равен78
Баланс равен79
Баланс равен80
Баланс равен81
Баланс равен82
Баланс равен83
Баланс равен84
Баланс равен85
Баланс равен86
Баланс равен87
Баланс равен88
Баланс равен89
Баланс равен90
Баланс равен91
Баланс равен92
Баланс равен93
Баланс равен94
Баланс равен95
Баланс равен96
Баланс равен97
Баланс равен98
Баланс равен99
Баланс равен100
 */