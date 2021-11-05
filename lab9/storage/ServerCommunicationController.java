package storage;


import communication.ServerMessage;
import main.Utils;

import java.util.Observable;
import java.util.Observer;

public class ServerCommunicationController implements Observer {

    public ServerCommunicationController() {
    }

    @Override
    public void update(Observable o, Object arg) {
        ServerMessage serverMessage = new ServerMessage(((SensorData)arg).getStepsCount(), Utils.getClientId(), ((SensorData)arg).getTimestamp());
        serverMessage.toString();
    }
}
