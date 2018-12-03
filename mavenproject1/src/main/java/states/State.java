/*
 * Copyright (C) 2017 AMIS research group, Faculty of Mathematics and Physics, Charles University in Prague, Czech Republic
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package states;

import com.mycompany.mavenproject1.EmptyBot;
import cz.cuni.amis.pogamut.base3d.worldview.object.Location;
import cz.cuni.amis.pogamut.ut2004.agent.module.sensor.NavPoints;
import cz.cuni.amis.pogamut.ut2004.communication.messages.gbinfomessages.Player;

/**
 *
 * @author m3lefloc
 */
public abstract class State {
    private Location lastPlayerLocation;
   
    protected EmptyBot _bot;
    private Player _target;
    protected NavPoints navPoints;
   
    
    public State(EmptyBot bot) {
        _bot = bot;
    }
   
    
    public abstract void run();
    public Location getLastPlayerLocation() {
        return lastPlayerLocation;
    }
    


    public void setLastPlayerLocation(Location lastPlayerLocation) {
        this.lastPlayerLocation = lastPlayerLocation;
    }
    
    public void setTarget(Player target){
        _target = target;
    }

    public Player getTarget() {
        return _target;
    }
   
    
}