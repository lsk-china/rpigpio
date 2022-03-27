# rpigpio

翻到了一个老项目，就顺手给他写完了
使用Springboot框架（虽然似乎没啥必要），通过JNI和wiringPi控制连接在树莓派第13引脚上的LED
运行：make run,需要maven环境，java1.8,gcc,wiringPi
访问ip:8081/on使引脚为高电平，/off为低电平
that's all :-)