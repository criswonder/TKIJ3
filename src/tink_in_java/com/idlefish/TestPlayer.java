package com.idlefish;


import com.player.AVUtils;
import com.player.IFlutterPlayer;
import com.player.IPlayerProvider;

public class TestPlayer {
    public void main() throws ClassNotFoundException {
//        AVUtils.setPlayerProvider(new FishPlayerProvider());
        Class.forName("xxxx");
//        IFlutterPlayer player = IFlutterPlayer
    }

    public class FishPlayerProvider implements IPlayerProvider{

        @Override
        public IFlutterPlayer getPlayer() {
            return new SystemPlayer();
        }
    }

    public class SystemPlayer implements IFlutterPlayer{

        @Override
        public void start() {

        }

        @Override
        public void play() {

        }
    }
}
