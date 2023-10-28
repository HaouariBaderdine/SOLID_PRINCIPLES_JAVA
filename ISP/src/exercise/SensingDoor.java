package exercise;

public class SensingDoor implements Door
{
    private boolean _locked;
    @SuppressWarnings("unused")
	private boolean _opened;

    public SensingDoor(Sensor sensor) throws Exception
    {
        sensor.register(this);
    }

    @Override
    public void lock()
    {
        _locked = true;
    }

    @Override
    public void unlock()
    {
        _locked = false;
    }

    @Override
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close()
    {
        _opened = false;
    }

    @Override
    public void timeOutCallback() throws Exception
    {
        throw new Exception();
    }

    @Override
    public void proximityCallback()
    {
        _opened = true;
    }
}
