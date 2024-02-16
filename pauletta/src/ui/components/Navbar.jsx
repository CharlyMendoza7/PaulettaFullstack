import { Link, NavLink } from "react-router-dom";

export const Navbar = () => {
  return (
    <nav className="navbar navbar-expand-sm navbar-dark navbar-custom p-2">
      <Link className="navbar-brand" to="/">
        Home
      </Link>

      <div className="navbar-collapse justify-content-center">
        <div className="navbar-nav">
          <NavLink
            className={({ isActive }) =>
              `nav-item nav-link ${isActive ? "active" : ""}`
            }
            to="/nosotros"
          >
            Nosotros
          </NavLink>

          {/* <NavLink
                        className={({ isActive }) => `nav-item nav-link ms-5 ${isActive ? 'active' : ''}`}
                        to="/faq"
                    >
                        FAQ
                    </NavLink> */}

          <NavLink
            className={({ isActive }) =>
              `nav-item nav-link ms-5 ${isActive ? "active" : ""}`
            }
            to="/comentarios"
          >
            Comentarios
          </NavLink>

          <NavLink
            className={({ isActive }) =>
              `nav-item nav-link ms-5 ${isActive ? "active" : ""}`
            }
            to="/contacto"
          >
            Contacto
          </NavLink>
        </div>
      </div>

      {/* <div className="navbar-collapse collapse w-100 order-3 dual-collapse2">
                <ul className="navbar-nav ml-auto">
                    <NavLink
                        className="nav-item nav-link"
                        to="/buscar"
                    >
                        Buscar
                    </NavLink>
                </ul>
            </div> */}
    </nav>
  );
};
