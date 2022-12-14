package io.frghackers.messenger.api.net.S2C;

import io.frghackers.messenger.api.net.FriendlyBuffer;
import io.frghackers.messenger.api.net.Packet;

public class PacketAllMembers extends Packet {
    public String[] usernames;

    public PacketAllMembers() {
        super();
    }

    public PacketAllMembers(String[] _usernames) {
        usernames = _usernames;
    }

    public void serialize(FriendlyBuffer _buffer) {
        _buffer.putStringArray(usernames);
    }

    public void deserialize(FriendlyBuffer _buffer) {
        usernames = _buffer.getStringArray();
    }

    public int getPacketId() {
        return ServerToClient.getId(ServerToClient.ALL_MEMBERS);
    }
}
