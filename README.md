# maven-multi-module-unittest-integrationtest-jacoco

Demo of 'Maven multi module' project WITH unit- and/or integration testing with FindBugs and Jacoco code coverage

# Results

   * Project copmlete Jacoco datafile : project-base / target / aggregate-exec / aggregate.exec
   * Project complete Jacoco report   ; project-base / test-reporting / site / index.html
   * FindBugs report
   
# Run

   * mvn clean install                      => unit testing + reporting
   * mvn clean install -P integration test  => integration testing + reporting
   * mvn clean install -P test-all          => unit AND integration testing + (combined) reporting !
   
# 参考
- [Mockito 中文文档 ( 2.0.26 beta )](https://github.com/hehonghui/mockito-doc-zh)
- [教你使用Mock完成单元测试](https://zhuanlan.zhihu.com/p/98074553)
- [[译] 使用强大的 Mockito 来测试你的代码](https://www.jianshu.com/p/f6e3ab9719b9)
- [Mockito教程](https://www.cnblogs.com/Ming8006/p/6297333.html)
- [这才是写单测的正确姿势](https://zhuanlan.zhihu.com/p/101026707)
- [Mockito的使用及原理及分析](https://zhuanlan.zhihu.com/p/28983008)

# maven-multi-module-unittest-integrationtest-jacoco
