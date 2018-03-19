/*
 * The ZLIB License
 *
 * Copyright 2018 Andrew Dean <me@ajdean.net>.
 *
 * This software is provided 'as-is', without any express or implied
 * warranty. In no event will the authors be held liable for any damages
 * arising from the use of this software.
 *
 * Permission is granted to anyone to use this software for any purpose,
 * including commercial applications, and to alter it and redistribute it
 * freely, subject to the following restrictions:
 *
 * 1. The origin of this software must not be misrepresented; you must not
 *    claim that you wrote the original software. If you use this software
 *    in a product, an acknowledgment in the product documentation would be
 *    appreciated but is not required.
 * 2. Altered source versions must be plainly marked as such, and must not be
 *    misrepresented as being the original software.
 * 3. This notice may not be removed or altered from any source distribution.
 */
package net.ajdean.system.obj;

import java.util.ArrayList;

/**
 *
 * @author Andrew Dean <me@ajdean.net>
 */
public final class SystemProcess {
    private String imageName, processID, sessionName, sessionID, memory, status, userName, cpuTime, winTitle;
    
    public SystemProcess(String[] parts) {
        imageName = parts[0]; processID = parts[1]; sessionName = parts[2];
        sessionID = parts[3]; memory    = parts[4]; status      = parts[5];
        userName  = parts[6]; cpuTime   = parts[7]; winTitle    = parts[8];
        //this.print();
    }
    
    public void print() {
        System.out.println("Image Name:       " + imageName);
        System.out.println("    Process ID:   " + processID);
        System.out.println("    Session Name: " + sessionName);
        System.out.println("    Session ID:   " + sessionID);
        System.out.println("    Memory:       " + memory);
        System.out.println("    Status:       " + status);
        System.out.println("    User Name:    " + userName);
        System.out.println("    CPU Time:     " + cpuTime);
        System.out.println("    Window Title: " + winTitle);
        System.out.println();
    }

    public String getImageName()   { return imageName; }
    public String getProccessID()  { return processID; }
    public String getSessionName() { return sessionName; }
    public String getSessionID()   { return sessionID; }
    public String getMemory()      { return memory; }
    public String getStatus()      { return status; }
    public String getUserName()    { return userName; }
    public String getCpuTime()     { return cpuTime; }
    public String getWindowTitle() { return winTitle; }    
}
