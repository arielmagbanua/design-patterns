using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpDesignPatterns.Singleton
{
    /// <summary>
    /// Thread Safety Singleton
    /// Reference: https://www.c-sharpcorner.com/UploadFile/8911c4/singleton-design-pattern-in-C-Sharp/
    /// </summary>
    public sealed class ThreadSafeSingleton
    {
        private static ThreadSafeSingleton _instance = null;
        private static readonly object _padlock = new object();

        private ThreadSafeSingleton() {}

        public static ThreadSafeSingleton Instance
        {
            get
            {
                lock (_padlock)
                {
                    if (_instance == null)
                    {
                        _instance = new ThreadSafeSingleton();
                    }

                    return _instance;
                }
            }
        }

        public string Name { get; set; }
    }
}
