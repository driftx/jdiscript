package org.jdiscript.handlers;

import com.sun.jdi.event.VMDisconnectEvent;

public interface OnVMDisconnect extends DebugEventHandler
{
	void exec(VMDisconnectEvent event);
}
