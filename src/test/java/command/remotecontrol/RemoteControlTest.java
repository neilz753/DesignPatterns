package command.remotecontrol;

import command.remotecontrol.furniture.*;
import command.remotecontrol.impl.*;
import org.junit.Test;

/**
 * 遥控器命令测试
 * @author neilz
 * @create 2020/5/25 16:30
 */
public class RemoteControlTest {

    @Test
    public void run_remoteControlTest() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
    }

    @Test
    public void run_garageDoorTest() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }

    @Test
    public void run_remoteLoader() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }

    @Test
    public void run_remoteLoaderundo() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

    @Test
    public void run_ceilingFanSpeedUndo() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);

        /**
         * 中速-->关闭
         * 撤销回到中速
         */
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        /**
         * 开启高速
         * 撤销回到中速
         */
        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

    @Test
    public void run_macroCommandTest() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOnCommand, stereoOnWithCDCommand, tvOnCommand, hottubOnCommand };
        Command[] partyOff = { lightOffCommand, stereoOffCommand, tvOffCommand, hottubOffCommand };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("------ Pushing Macro On ------");
        remoteControl.onButtonWasPushed(0);
        System.out.println("------ Pushing Macro Off ------");
        remoteControl.offButtonWasPushed(0);

    }

    /**
     * Command 接口只有一个方法的情况下，利用lambda表达式，
     * 在setCommand方法传参中用lambda表达式替换具体的Command对象，
     * 省去各种Command类创建。
     */
    @Test
    public void run_commandLambda() {
        RemoteControlLambda remoteControl = new RemoteControlLambda();

        Light light = new Light("Living Room");

        remoteControl.setCommand(0, () -> {light.on();}, () -> {light.off();});
        remoteControl.setCommand(1, light::on, light::off);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
    }

}
