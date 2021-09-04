
namespace CSharpDesignPatterns.Singleton
{
    /// <summary>
    /// Non Thread Safe Singleton
    /// Reference: https://www.c-sharpcorner.com/UploadFile/8911c4/singleton-design-pattern-in-C-Sharp/
    /// </summary>
    public sealed class BasicSingleton
    {
        private static BasicSingleton _instance = null;

        private BasicSingleton() {}

        public static BasicSingleton Instance
        {
            get
            {
                if (_instance == null)
                {
                    _instance = new BasicSingleton();
                }

                return _instance;
            }
        }

        public string Name { get; set; }
    }
}
