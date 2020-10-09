package State;


public class  StatePatternYumichan{

 

    /** 由実ちゃんの状態を表すプロパティ */

    private State state = null;

  
   
  //  BadMoodState Bstate = new BadMoodState();
    
    OrdinaryState Ostate = new OrdinaryState();
    
    /**

     * 由実ちゃんの状態を変更するメソッド

     * @param state

     */
    public void kibun() {
    	
    	
    	changeState(Ostate);
      //  return this.state.morningGreet();

    }

    
    
    private void changeState(State state) {

        this.state = state;

    }

 

    /**

     * 朝のあいさつを返すメソッド

     * @return

     */

    public String morningGreet() {

        return this.state.morningGreet();

    }

 

    /**

     * 寒いときの対策を取得するメソッド

     * @return

     */

    public String getProtectionForCold() {

        return this.state.getProtectionForCold();

    }

}
