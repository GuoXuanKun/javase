package day240509.practice.abstract_rule;

public abstract class Test {
//    Modifier 'abstract' not allowed here
    /*abstract*/ int i;

//    Modifier 'abstract' not allowed here
    /*abstract*/ {}

//    Modifier 'abstract' not allowed here
    /*abstract*/ public Test(){}

//    Illegal combination of modifiers: 'abstract' and 'private'
//    修饰语的非法组合:'abstract'和'private'
    /*abstract*/ private void test(){}
}
