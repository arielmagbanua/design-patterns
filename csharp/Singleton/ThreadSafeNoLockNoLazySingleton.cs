
namespace CSharpDesignPatterns.Singleton
{
    /// <summary>
    /// Thread Safe Singleton without using locks and no lazy instantiation
    /// Reference: https://www.c-sharpcorner.com/UploadFile/8911c4/singleton-design-pattern-in-C-Sharp/
    /// </summary>
    public sealed class ThreadSafeNoLockNoLazySingleton
    {
        private static readonly ThreadSafeNoLockNoLazySingleton _instance = new ThreadSafeNoLockNoLazySingleton();

        // Explicit static constructor to tell C# compiler  
        // not to mark type as beforefieldinit
        static ThreadSafeNoLockNoLazySingleton() {}

        private ThreadSafeNoLockNoLazySingleton() {}

        public static ThreadSafeNoLockNoLazySingleton Instance
        {
            get { return _instance; }
        }

        public string Name { get; set; }
    }
}
